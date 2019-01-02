package CH8Classes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ChristopherTroinaDVDCollection, Stores a collection of DVDs and Blu-Ray disks.
 * @author Christopher Troina
 */
public class ChristopherTroinaDVDCollection {
    private ChristopherTroinaDVD[] collection;
    private int count;
    private double totalCost;

    /**
     * Creates a new ChristopherTroinaDVDCollection
     */
    public ChristopherTroinaDVDCollection(){
        collection=new ChristopherTroinaDVD[5];
        count=0;
    }

    /**
     * Adds a movie to the collection, calls increase size method if the array is too small.
     * @param title, the name of the movie being added.
     * @param director, the director of the movie being added.
     * @param year, the year the film being added released.
     * @param cost, the price of the DVD or Blu-Ray disk.
     * @param blueray, if the film is on a Blu-Ray disk or not.
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray){
        if(count==collection.length)
            increaseSize();
        collection[count]=new ChristopherTroinaDVD(title, director, year, cost, blueray);
        count++;
        totalCost+=cost;
        totalCost=Math.round(totalCost*100.0)/100.0;
    }

    /**
     * Increases the size of the array by five if it becomes too large.
     */
    private void increaseSize(){
        collection=Arrays.copyOf(collection, collection.length+5);
    }

    /**
     * Creates a string to store the total cost of the collection, average cost, number of movies, and formats the title
     * cost, release year, and director in a table.
     * @return The string containing the collection.
     */
    public String toString(){
        /**The average cost of the entire collection*/
        String averageCost="$"+Math.round((totalCost/(double)count)*100.0)/100.0;
        /**The decimal point and beyond of the average cost, used to check if a zero needs to be added*/
        String centsAv=averageCost.substring(averageCost.indexOf('.'));
        //adds a zero to the end of the average cost if it ends in zero.
        if(centsAv.length()==2)
            averageCost+="0";
        /**Formats the total cost into a String to check if a zero is needed to be added, and for use in the table*/
        String totalST="$"+totalCost;
        /**The decimal point and beyond of the total cost, used to check if a zero needs to be added*/
        String centsT=totalST.substring(totalST.indexOf('.'));
        //adds a zero to the end of the price if it ends in zero.
        if(centsT.length()==2)
            totalST+="0";
        /**The String to store the display of the collection, with the table storing the DVDs.*/
        String string="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nMy DVD Collection\n\nNumber of DVDs: "+count+
                "\nTotal cost: "+totalST+"\nAverage cost: " +averageCost+"\n\nDVD List:\n\n";
        /**The array used to create the table*/
        final Object[][] table = new String[count][];
        //stores the values of each film in the table array.
        for(int i=0;i<count;i++) {
            /**Stores the result of the toString for the current film*/
            String dvd=collection[i].toString();
            /**Scanner used to extract the values from the dvd string*/
            Scanner scan=new Scanner(dvd);
            /**The cost of the current DVD*/
            String cost=scan.nextLine();
            /**The year of release of the current DVD.*/
            String year=scan.nextLine();
            /**The title of the current DVD.*/
            String title=scan.nextLine();
            /**The director of the current DVD.*/
            String director=scan.nextLine();
            /**If the current film is a DVD or Blu-Ray disk.*/
            boolean bluray=false;
            if(scan.hasNextLine())
                bluray=true;
            /**The decimal point and beyond of the cost, used to check if a zero needs to be added*/
            String cents=cost.substring(cost.indexOf('.'));
            //adds a zero to the end of the cost if it ends in zero.
            if(cents.length()==2)
                cost+="0";
            //adds the value to the table array.
            if(bluray)
                table[i] = new String[]{cost, year, title, director, "Blu-Ray"};
            else
                table[i] = new String[]{cost, year, title, director, ""};
        }
        //Formats the array into a able and adds it to the string.
        for (final Object[] row : table) {
            //adds the table to the string to be returned
            string+=string.format("%-8s%-8s%-25s%-30s%-45s\n", row);
        }
        return string;
    }
}
