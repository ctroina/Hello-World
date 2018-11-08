package CH7;
//this program reads numbers of various sizes from an external file and adds each line of them together, and prints the result
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ChristopherTroinaSum {
    public static final int MAX_DIGITS=25;
    public static void main(String[] args){
        //finds file
        File file=new File("sum.txt");
        try {
            //creates scanner and passes it and the file to the method for creating the array of digits;
            Scanner scan = new Scanner(file);
            arrayCreate(scan, file);
        }
        catch (FileNotFoundException e) {
            //throws exception if file isn't found
            e.printStackTrace();
        }
    }
    public static void arrayCreate(Scanner scan, File file){
        //variable for tracking the maximum number of numbers in all rows of the file.
        int maxparam=0;
        while(scan.hasNextLine()){
            String line=scan.nextLine();
            Scanner linescan=new Scanner(line);
            //counts parameters in each line
            int params=0;
            while(linescan.hasNext()) {
                params++;
                linescan.next();
            }
            //sets maxparam to the number of parameters in that line if that number is larger
            if(Math.max(maxparam,params)==params)
                maxparam=params;
        }
        //creates a 2d array with the maximum parameters as the rows, and maximum digits constant as the columns
        int[][] add=new int[maxparam][MAX_DIGITS];
        //calls method to populate the array
        arrayStore(add, file);


    }
    public static void arrayStore(int[][] add, File file){
        try {
            //creates new scanner to scan for the numbers to populate the array
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                Scanner linescan = new Scanner(line);
                //counter variable
                int count = 0;
                while (linescan.hasNext()) {
                    //creates string to store the number
                    String num = linescan.next();
                    //creates int to store how many zeros go before the number
                    int zeros = MAX_DIGITS - num.length();
                    //prints number and plus sign
                    System.out.print(num + " ");
                    if (linescan.hasNext())
                        //if there is another number, prints another plus sign
                        System.out.print("+ ");
                    else
                        //if this is the final number, prints equals sign
                        System.out.print("= ");
                    for (int i = 0; i < num.length(); i++)
                        //goes through the string to store each char (converted into an int) in the 2d array
                        add[count][zeros + i] = Character.getNumericValue(num.charAt(i));
                    count++;
                }
                addition(add);
                for(int i=0;i<add.length;i++)
                    //after the the addition method added the numbers, the 2d array is set back to zero
                    Arrays.fill(add[i], 0);
            }
        }
        catch (FileNotFoundException e) {
            //throws exception if file isn't found (though this would never happen)
            e.printStackTrace();
        }
    }
    public static void addition(int[][] add){
        //creates new int to hold the sum of all of the numbers stored in the rows of the 2d array.
        int [] summ=new int[MAX_DIGITS];
        for(int i=MAX_DIGITS-1;i>=0;i--){
            //creates a variable to store the sum of the digits in the column i
            int sum=0;
            for(int ii=0;ii<add.length;ii++)
                //adds each digit to the sum variable
                sum += add[ii][i];
            if(sum<10)
                //if the sum is a single digit, the sum is added into the corresponding spot in the summ array
                summ[i]=sum;
            else {
                /*If the sum is more than a single digit then the a string is created to store the sum, the final
                the final index of the string is added to the summ array as normal, but the other indexes are added
                back into the original 2d array storing all the digits.*/
                String sumst = Integer.toString(sum);
                summ[i]=Character.getNumericValue(sumst.charAt(sumst.length()-1));
                int off=1;
                for(int ii=sumst.length()-2;ii>=0;ii--){
                    add[0][i-off]+=Character.getNumericValue(sumst.charAt(ii));
                    off++;
                }
            }
        }
        String sumst="";
        for(int i=0;i<MAX_DIGITS;i++)
            //final sum is converted into a string
            sumst+=summ[i];
        //creates a string with the same length as the sum string, but made up of solely zeros
        String zerost="";
        for(int i=0;i<sumst.length();i++)
            zerost+="0";
        //checks if the final sum is zero using the zero string created above
        if(sumst.equals(zerost))
            System.out.println("0");
        while(sumst.charAt(0)=='0') {
            //removes all the zeros at the beginning of the sum
            sumst = sumst.substring(1);
            //if the string is empty, returns to previous method
            if (sumst.length() == 0)
                return;
        }
        //prints the sum
        System.out.println(sumst);
    }
}