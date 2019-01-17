package CH10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ChristopherTroinaRandomNumbersArrayList, Takes number data from a text file and displays them all in a list, as well
 * as the average, smallest and largest values, and the list with only odd numbers.
 * @author Christopher Troina
 */
public class ChristopherTroinaRandomNumbersArrayList {

    /**
     * The main method, calls the print method to start program; and creates the ArrayList variable.
     * @throws FileNotFoundException, if file "randomNumbers.txt" is not found.
     */
    public static void main(String[] args) throws FileNotFoundException {
        //the list to be used in the rest of the program
        ArrayList<Integer> nums=new ArrayList<>();
        print(nums);
    }

    /**
     * Prints the list, the average value, the max value, the min value, and the list without even numbers, using the
     * output from the other methods.
     * @param nums the empty list to be filled.
     * @throws FileNotFoundException, if the file "randomNumbers.txt" is not found.
     */
    public static void print(ArrayList<Integer> nums) throws FileNotFoundException {
        //fills the list with data from "randomNumbers.txt".
        fill(nums);
        //prints out calculated data
        System.out.println(nums);
        System.out.println("Average: "+average(nums));
        int[] minmax=minMax(nums);
        System.out.println("min: "+minmax[0]);
        System.out.println("max: "+minmax[1]);
        System.out.println(removeEvens(nums));
    }

    /**
     * Fills the nums ArrayList with values from the "randomNumbers.txt" file.
     * @param nums the empty list to be filled.
     * @throws FileNotFoundException, if the file "randomNumbers.txt" is not found.
     */
    public static void fill(ArrayList<Integer> nums) throws FileNotFoundException {
        //creates a File and a Scanner to scan the File
        File file=new File("randomNumbers.txt");
        Scanner scan=new Scanner(file);
        //adds the numbers from the file to the list
        while(scan.hasNextInt()){
            nums.add(scan.nextInt());
        }
    }

    /**
     * Takes the average of all the values in the nums ArrayList and returns it.
     * @param nums the list which hold the values to be averaged.
     * @return the average of all the values.
     */
    public static double average(ArrayList<Integer> nums){
        //the sum of all numbers in the list
        int sum=0;
        //adds all numbers from the list to the sum variable
        for(int i=0;i<nums.size();i++)
            sum+=nums.get(i);
        //returns the average of all the numbers.
        return (double)sum/(double)nums.size();
    }

    /**
     * Finds the smallest and largest value in the nums ArrayList, and returns them in an int array.
     * @param nums the list which the smallest and largest values are found from.
     * @return An int array containing the minimum value at index 0, and the maximum value at index 1.
     */
    public static int[] minMax(ArrayList<Integer> nums){
        //the largest number
        int max=nums.get(0);
        //the smallest number
        int min=nums.get(0);
        //goes through the entire list to find the largest and smallest numbers
        for(int i=1;i<nums.size();i++){
            if(Math.max(nums.get(i),max)==nums.get(i))
                max=nums.get(i);
            if(Math.min(nums.get(i), min)==nums.get(i))
                min=nums.get(i);
        }
        //creates and returns an array to store the largest and smallest numbers
        int[] minmax={min, max};
        return minmax;
    }

    /**
     * Returns a new ArrayList that contains all odd values from the nums array list, without the even values.
     * @param nums the list from which the values will be taken from.
     * @return the new list containing only the odd numbers from the nums ArrayList.
     */
    public static ArrayList<Integer> removeEvens(ArrayList<Integer> nums) {
        //creates the new list that will contain no even numbers
        ArrayList<Integer> list = new ArrayList<>();
        //finds all the odd numbers in the nums list and adds them to the new list
        for(int i=0;i<nums.size();i++){
            //checks if number at index i in the nums list is odd
            if(nums.get(i)%2!=0)
                list.add(nums.get(i));
        }
        return list;
    }
}
