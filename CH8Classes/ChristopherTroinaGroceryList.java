package CH8Classes;
import java.util.Scanner;
/**
 * ChristopherTroinaGroceryList, simulates a grocery list with the maximum amount of items represented by MAX_ITEMS.
 * @author Christopher Troina
 */

public class ChristopherTroinaGroceryList {
    /**the maximum number of items in the list*/
    public static final int MAX_ITEMS=10;
    private ChristopherTroinaGroceryItem[] list;
    private int numItems;

    /**
     *Creates a new ChristopherTroinaGroceryList object.
     */
    public ChristopherTroinaGroceryList(){
        list=new ChristopherTroinaGroceryItem[MAX_ITEMS];
        numItems=0;
    }

    /**
     * Calculates the total cost of all items in the list.
     * @return cost for all items in the list, rounded to the nearest hundredth.
     */
    public double getTotalCost() {
        double totalCost=0;
        for(int i=0;i<numItems;i++){
            totalCost+=list[i].getCost();
        }
        return Math.round(totalCost*100.0)/100.0;
    }

    /**
     * Adds an item to the created list if the number of items isn't already at MAX_ITEMS.
     * @param item a ChristopherTroinsGroceryItem object to be added to the list
     */
    public void addItem(ChristopherTroinaGroceryItem item){
        if(numItems>=MAX_ITEMS)
            System.out.println("List is too large. Cannot add another item.");
        else {
            list[numItems] = item;
            numItems++;
        }
    }

    /**
     * Creates a table to display the name, price, and quantity of each item on the list, as well as the total cost.
     * @return the string containing the table.
     */
    public String toString(){
        String lineST="My Grocery List:\n\n";
        /**The array for which the table will be constructed with*/
        final Object[][] table = new String[numItems+2][];
        table[0] = new String[] { "Name", "Price", "Quantity" };
        //adds the name, price per unit. and quantity of each item in the list to the table
        for(int i=1;i<numItems;i++) {
            /**Stores the result of the toString() method in the current*/
            String itemST=list[i].toString();
            /**For extracting the name and quantity from itemST*/
            Scanner scan=new Scanner(itemST);
            /**The name of the item to be used in the table*/
            String name=scan.nextLine();
            /**The quantity of the item to be used in the table*/
            int quantity=scan.nextInt();
            /**The price per unit of the item*/
            double price=list[i].getCost()/(double)quantity;
            /**The price converted into a String to be use in the table and to create the cents variable*/
            String priceST="$"+price;
            /**The decimal point and everything following it from the price, used to find if a zero must be added to the
             * price*/
            String cents=priceST.substring(priceST.indexOf('.'));
            //adds a zero to the end of the price if it ends in zero.
            if(cents.length()==2)
                priceST+="0";
            table[i] = new String[]{name, priceST, ""+quantity};
        }
        /**The total price converted into a String to be use in the table and to create the cents variable*/
        String priceST="$"+getTotalCost();
        /**The decimal point and everything following it from the price, used to find if a zero must be added to the
         * total price*/
        String cents=priceST.substring(priceST.indexOf('.'));
        //adds a zero to the end of the total price if it ends in zero.
        if(cents.length()==2)
            priceST+="0";
        table[table.length-2]=new String[]{"TOTAL",priceST,""};
        table[table.length-1]=new String[]{"","",""};
        //formats the table
        for (final Object[] row : table) {
            //adds the table to the string to be returned
            lineST+=lineST.format("%-15s%-15s%-15s\n", row);
        }
        return lineST;
    }
}
