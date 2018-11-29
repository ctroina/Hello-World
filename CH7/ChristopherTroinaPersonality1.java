package CH7;
/*this program reads the results gotten by multiple people on a personality test from an external file and prints it to
an external output file*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ChristopherTroinaPersonality1 {
    public static void main(String[] args){
        //creates scanner for user input
        Scanner console=new Scanner(System.in);
        //asks user for name of input file
        System.out.print("Input file name: ");
        String filename=console.next();
        File file=new File(filename);
        //creates while loop to run while file is not found
        while(!file.exists()){
            //prompts user to enter a different file
            System.out.print("File not found. Try again: ");
            filename=console.next();
            file=new File(filename);
        }
        try {
            //creates a Scanner to scan the file the user inputted
            Scanner input = new Scanner(file);
            //asks user for output file name
            System.out.print("Output file name: ");
            String outfile=console.next();
            try {
                //creates a PrintStream to write to output file
                PrintStream stream = new PrintStream(outfile);
                //calls method to scan the file
                fileScan(input, stream);
            }
            //catches FileNotFoundException for the PrintStream stream
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
        //catches FileNotFoundException for the Scanner input (though this would never occur)
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    /*this method scans through the file and prints the participant's name to the output file, and stores the number of
    a's and b's*/
    public static void fileScan(Scanner input, PrintStream stream){
        //creates a counter variable to track whether or not the line of the file the Scanner is on is even or odd
        int count=1;
        //runs the while loop to process through the entire file until it ends
        while(input.hasNextLine()){
            //checks if the line is odd
            if(count/2*2!=count){
                //prints the name of the participant
                String line=input.nextLine();
                Scanner linescan= new Scanner(line);
                while(linescan.hasNext())
                    stream.print(linescan.next()+" ");
                stream.println();
            }
            //if the line is even
            else{
                //creates another counter variable for the index of the answers
                int stcount=0;
                //creates an array to store the number of a's and b's in each category
                int[][] asbs=new int[4][2];
                //creates a string to store the answers
                String answers=input.nextLine();
                //runs for each of the blocks of seven questions
                for(int i=1;i<=10;i++){
                    //runs for each of the seven questions
                    for(int ii=1;ii<=7;ii++){
                        /*increments the specific row in the 2D array by one, either the first or second column
                        depending on the answer*/
                        if(answers.charAt(stcount)=='a'||answers.charAt(stcount)=='A')
                            asbs[ii/2][0]++;
                        else if(answers.charAt(stcount)=='b'||answers.charAt(stcount)=='B')
                            asbs[ii/2][1]++;
                        stcount++;
                    }
                }
                //calls the method to print the results
                filePrint(asbs, stream);
            }
            count++;
        }
    }
    //this method prints the found by the previous method to the output file
    public static void filePrint(int[][] asbs, PrintStream stream){
        //goes through the array with the results and prints them to the output file
        for(int i=0;i<4;i++)
            stream.print(asbs[i][0]+"A-"+asbs[i][1]+"B ");
        stream.println();
        //calls the method to calculate the percent to create the array of percents
        int[] percents=percent(asbs);
        //prints the percentage of b's for each category
        stream.print("[");
        for(int i=0;i<4;i++)
            stream.print(percents[i]+"%, ");
        stream.print("] = ");
        //calls the method to determine the personality categories of the participant
        String category=findCategory(percents);
        //prints the category
        stream.println(category);
        //creates a blank line between two entries
        stream.println();
    }
    //this method calculates the percent of b's that the user answers and returns it
    public static int[] percent(int[][]asbs){
        //creates an array to store the percent
        int[] percents=new int[4];
        /*goes through the number of b's for every category and divides them by the sum of the a's and b's for that
        category*/
        for(int i=0;i<4;i++)
            percents[i] = (int)(asbs[i][1] /(double)(asbs[i][1]+asbs[i][0])  * 100.0);
        //returns the array of percents
        return percents;
    }
    //this method determines the personality category and returns it as a String
    public static String findCategory(int[] percents){
        //creates the String to store the personality category
        String category="";
        //finds if the participant is an extrovert, introvert, or if they answered an equal amount of a's and b's
        if(percents[0]<50)
            category+="E";
        else if(percents[0]>50)
            category+="I";
        else
            category+="X";
        /*finds if the participant senses, or goes by their intuition, or if they answered an equal amount of a's and
        b's*/
        if(percents[1]<50)
            category+="S";
        else if(percents[1]>50)
            category+="N";
        else
            category+="X";
        //finds if the participant mostly thinks, mostly feels, or if they answered an equal amount of a's and b's
        if(percents[2]<50)
            category+="T";
        else if(percents[2]>50)
            category+="F";
        else
            category+="X";
        //finds if the participant mostly judges, mostly perceives, or if they answered an equal amount of a's and b's
        if(percents[3]<50)
            category+="J";
        else if(percents[3]>50)
            category+="P";
        else
            category+="X";
        return category;
    }
}