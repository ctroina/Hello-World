package CH10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan1=new Scanner(new File("text1.txt"));
        Scanner scan2=new Scanner(new File("text2.txt"));
        ArrayList<String> list1=getWords(scan1);
        System.out.println(list1);
        ArrayList<String> list2=getWords(scan2);
    }
    public static ArrayList<String> getWords(Scanner scan){
        ArrayList<String> words=new ArrayList<>();
        while(scan.hasNext())
            words.add(scan.next().toLowerCase());
        Collections.sort(words);
        return words;
    }
}
