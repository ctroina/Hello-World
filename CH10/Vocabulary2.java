package CH10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan1=new Scanner(new File("text1.txt"));
        Scanner scan2=new Scanner(new File("text2.txt"));
        ArrayList<String> list1=getWords(scan1);
        System.out.println(list1);
        ArrayList<String> list2=getWords(scan2);
        System.out.println(list2);
        ArrayList<String> overlap=overlap(list1, list2);
        System.out.println(overlap);
    }
    public static ArrayList<String> getWords(Scanner scan){
        scan.useDelimiter("[^a-zA-Z']+");
        ArrayList<String> words=new ArrayList<>();
        while(scan.hasNext())
            words.add(scan.next().toLowerCase());
        Collections.sort(words);
        //eliminate duplicates
        ArrayList<String> unique=new ArrayList<>();
        if(words.size()>0){
            unique.add(words.get(0));
            for(int i=1;i<words.size();i++){
                if(!words.get(i).equals(words.get(i-1)))
                    unique.add(words.get(i));
            }
        }
        return unique;
    }
    public static ArrayList<String> overlap(ArrayList<String> list1, ArrayList<String> list2){
        int i1=0;
        int i2=0;
        ArrayList<String> overlap=new ArrayList<>();
        while((i1<list1.size())&&(i2<list2.size())){
            int compare=list1.get(i1).compareTo(list2.get(i2));
            if(compare==0){
                overlap.add(list1.get(i1));
                i1++;
                i2++;
            }
            else if(compare<0){
                i1++;
            }
            else
                i2++;
        }
        return overlap;
    }

}
