package CH10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan1=new Scanner(new File("moby.txt"));
        Scanner scan2=new Scanner(new File("lear.txt"));
        ArrayList<String> list1=getWords(scan1);
        //System.out.println(list1);
        ArrayList<String> list2=getWords(scan2);
        //System.out.println(list2);
        ArrayList<String> overlap=overlap(list1, list2);
        //System.out.println(overlap);
        //System.out.println();
        System.out.println("Text1 words = "+list1.size());
        System.out.println("Text2 words = "+list2.size());
        double overlap1=(double)overlap.size()/(double)list1.size()*100.0;
        double overlap2=(double)overlap.size()/(double)list2.size()*100.0;
        System.out.println("percentage of  text 1 in overlap= "+overlap1);
        System.out.println("percentage of  text 2 in overlap= "+overlap2);
    }
     public static ArrayList<String> getWords(Scanner scan){
        scan.useDelimiter("[^a-zA-z']+");
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
