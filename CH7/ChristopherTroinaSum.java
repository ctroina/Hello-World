package CH7;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ChristopherTroinaSum {
    public static final int MAX_DIGITS=25;
    public static void main(String[] args){
        File file=new File("sum.txt");
        try {
            Scanner scan = new Scanner(file);
            arrayCreate(scan, file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void arrayCreate(Scanner scan, File file){
        int maxparam=0;
        while(scan.hasNextLine()){
            String line=scan.nextLine();
            Scanner linescan=new Scanner(line);
            int params=0;
            while(linescan.hasNext()) {
                params++;
                linescan.next();
            }
            if(Math.max(maxparam,params)==params)
                maxparam=params;
        }
        int[][] add=new int[maxparam][MAX_DIGITS];
        matrixStore(add, file);
    }
    public static void matrixStore(int[][] add, File file){
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                Scanner linescan = new Scanner(line);
                int count = 0;
                while (linescan.hasNext()) {
                    String num = linescan.next();
                    int zeros = MAX_DIGITS - num.length();
                    System.out.print(num + " ");
                    if (linescan.hasNext())
                        System.out.print("+ ");
                    else
                        System.out.print("= ");
                    for (int i = 0; i < num.length(); i++)
                        add[count][zeros + i] = Character.getNumericValue(num.charAt(i));
                    count++;
                }
                addition(add);
                for(int i=0;i<add.length;i++){
                    for(int ii=0;ii<MAX_DIGITS;ii++)
                        add[i][ii]=0;
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void addition(int[][] add){
        int [] summ=new int[MAX_DIGITS];
        for(int i=0;i<MAX_DIGITS;i++){
            int sum=0;
            for(int ii=0;ii<add.length;ii++) {
                sum += add[ii][i];
                if(sum<10)
                    summ[i]=sum;
                else{
                    String sumst=Integer.toString(sum);
                    summ[i-1]+=Character.getNumericValue(sumst.charAt(0));
                    summ[i]=Character.getNumericValue(sumst.charAt(1));
                }
            }
        }
        if(summ[summ.length-1]==0)
            System.out.println("0");
        String sumst="";
        for(int i=0;i<MAX_DIGITS;i++)
            sumst+=summ[i];
        for (int i = 0; i < sumst.length() - 1; i++) {
            if (sumst.charAt(i) == '0')
                sumst = sumst.substring(1);
        }
        System.out.println(sumst);
    }
}