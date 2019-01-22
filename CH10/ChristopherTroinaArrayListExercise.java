package CH10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ChristopherTroinaArrayListExercise, reads words from a file and puts them in an ArrayList. Prints that list, the list
 * backwards, with the last letter of a plurals capitalized, and with all plurals removed.
 */
public class ChristopherTroinaArrayListExercise {
    /**
     * The main method, creates the ArrayList variable and passes it to the fill method to continue the program.
     * @throws FileNotFoundException if the "data.txt" file is not found.
     */
    public static void main(String[] args) throws FileNotFoundException {
        //the list that will store the data
        ArrayList<String> list = new ArrayList<>();
        //calls method
        fill(list);
    }

    /**
     * Fills the list with the contents of the file and prints the list, then calls reverse method.
     * @param list, the list to be filled.
     * @throws FileNotFoundException if the "data.txt" file is not found.
     */
    public static void fill(ArrayList<String> list) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        //fills the list with the data
        while (scan.hasNext())
            list.add(scan.next());
        System.out.println(list);
        //calls method to print out the list reversed
        reverse(list);
    }

    /**
     * Creates a new list that consists of the old list in reverse order, and then prints that list, then calls plurals
     * method.
     * @param list, the list with the data to be reversed by the method.
     */
    public static void reverse(ArrayList<String> list) {
        //the new list that will contain the reversed contents of list.
        ArrayList<String> list2 = new ArrayList<>();
        //adds the data from the old list to the new one in reverse order.
        for (int i = list.size() - 1; i >= 0; i--)
            list2.add(list.get(i));
        System.out.println(list2);
        //calls method to capitalize and remove all plurals.
        plurals(list);
    }

    /**
     * Creates two new list, one that has the last letters of all plurals capitalized, and one that has all plurals
     * removed.
     * @param list, the list with the data that the two new lists will be based off.
     */
    public static void plurals(ArrayList<String> list) {
        //new list that will have the last letter of all plurals capitalized.
        ArrayList<String> list3 = new ArrayList<>();
        //copies the contents of list into list3.
        list3.addAll(list);
        for (int i = 0; i < list3.size(); i++) {
            //if the word ends in "s" then it gets changed to a capital "S".
            if (list3.get(i).charAt(list3.get(i).length() - 1) == 's')
                list3.set(i, list3.get(i).substring(0, list3.get(i).length() - 1)+'S');
        }
        System.out.println(list3);
        //new list that will contain no plurals
        ArrayList<String> list4=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            //if the word does not end in "s", then it gets added to list4.
            if(list.get(i).charAt(list.get(i).length()-1)!='s')
                list4.add(list.get(i));
        }
        System.out.println(list4);
    }
}
