package CH10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChristopherTroinaArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        fill(list);
    }

    public static void fill(ArrayList<String> list) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext())
            list.add(scan.next());
        System.out.println(list);
        reverse(list);
    }

    public static void reverse(ArrayList<String> list) {
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--)
            list2.add(list.get(i));
        System.out.println(list2);
        plurals(list);
    }

    public static void plurals(ArrayList<String> list) {
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list);
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).charAt(list3.get(i).length() - 1) == 's')
                list3.set(i, list3.get(i).substring(0, list3.get(i).length() - 1)+'S');
        }
        System.out.println(list3);
        ArrayList<String> list4=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).charAt(list.get(i).length()-1)!='s')
                list4.add(list.get(i));
        }
        System.out.println(list4);
    }
}
