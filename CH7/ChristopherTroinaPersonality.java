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
                    stream.print(linescan.next());
                stream.println();
            }
            else{
                count=0;
                int[][] asbs=new int[4][2];
                String answers=input.next();
                for(int i=1;i<=10;i++){
                    for(int ii=7;ii<=10;ii++){
                        
                    }
                }
            }
        }
    }
}
