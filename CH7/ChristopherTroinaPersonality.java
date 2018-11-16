package CH7;

import java.io.File;
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
        System.out.print("Output file name: ");
        String outfile=console.next();
        PrintStream stream=new PrintStream(outfile);
    }
}
