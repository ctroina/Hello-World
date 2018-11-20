package CH7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ChristopherTroinaPersonality {
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("Input file name: ");
        String filename=console.next();
        File file=new File(filename);
        while(!file.exists()){
            System.out.print("File not found. Try again: ");
            filename=console.next();
            file=new File(filename);
        }
        try {
            Scanner input = new Scanner(file);
            System.out.print("Output file name: ");
            String outfile=console.next();
            try {
                PrintStream stream = new PrintStream(outfile);
                fileScan(input, stream);
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void fileScan(Scanner input, PrintStream stream){
        int count=1;
        while(input.hasNextLine()){
            if(count/2*2!=count){
                String line=input.nextLine();
                Scanner linescan= new Scanner(line);
                while(linescan.hasNext())
                    stream.print(linescan.next()+" ");
                stream.println();
            }
            else{
                int stcount=0;
                int[][] asbs=new int[4][2];
                String answers=input.nextLine();
                for(int i=1;i<=10;i++){
                    for(int ii=1;ii<=7;ii++){
                        if(answers.charAt(stcount)=='a'||answers.charAt(stcount)=='A')
                            asbs[ii/2][0]++;
                        else if(answers.charAt(stcount)=='b'||answers.charAt(stcount)=='B')
                            asbs[ii/2][1]++;
                        stcount++;
                    }
                }
                filePrint(asbs, stream);
            }
            count++;
        }
    }
    public static void filePrint(int[][] asbs, PrintStream stream){
        for(int i=0;i<4;i++)
            stream.print(asbs[i][0]+"A-"+asbs[i][1]+"B ");
        stream.println();
        int[] percents=percent(asbs);
        stream.print("[");
        for(int i=0;i<4;i++)
            stream.print(percents[i]+"%, ");
        stream.print("] = ");
        String category=findCategory(percents);
        stream.println(category);
        stream.println();
    }
    public static int[] percent(int[][]asbs){
        int[] percents=new int[4];
        for(int i=0;i<4;i++) {
            if (i == 0)
                percents[i] = asbs[i][1] / 10 * 100;
            else
                percents[i] = asbs[i][1] / 20 * 100;
        }
        return percents;
    }
    public static String findCategory(int[] percents){
        String category="";
        if(percents[0]<50)
            category+="E";
        else if(percents[0]>50)
            category+="I";
        else
            category+="X";
        if(percents[1]<50)
            category+="S";
        else if(percents[1]>50)
            category+="N";
        else
            category+="X";
        if(percents[2]<50)
            category+="T";
        else if(percents[2]>50)
            category+="F";
        else
            category+="X";
        if(percents[3]<50)
            category+="J";
        else if(percents[3]>50)
            category+="P";
        else
            category+="X";
        return category;
    }
}

