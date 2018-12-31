package CH8Classes;

/**
 * ChristopherTroinaGroceryListClient, Runs the the ChristopherTroinaGroceryList class.
 * @author Christioher Troina
 */
public class ChristopherTroinaGroceryListClient {
    /**
     * Creates a new ChristopherTroinaGroceryList object, adds ten items to it, and prints it.
     */
    public static void main(String[] args){
        /**The ChristopherTroinaGroceryList object used to test the ChristopherTroinaGroceryList and
         *ChristopherTroinaGroceryItemOrder classes*/
        ChristopherTroinaGroceryList list=new ChristopherTroinaGroceryList();
        list.addItem(new ChristopherTroinaGroceryItemOrder("Napkins", 2, 5));
        list.addItem(new ChristopherTroinaGroceryItemOrder("Ham", 10, 15));
        list.addItem(new ChristopherTroinaGroceryItemOrder("Turkey", 15, 10));
        list.addItem(new ChristopherTroinaGroceryItemOrder("Wrapping Paper", 3, 19.99));
        list.addItem(new ChristopherTroinaGroceryItemOrder("Sugar", 1, 16.55));
        list.addItem(new ChristopherTroinaGroceryItemOrder("Tape", 4, 3));
        list.addItem(new ChristopherTroinaGroceryItemOrder("Cheese", 1, 1999.99));
        list.addItem(new ChristopherTroinaGroceryItemOrder("Milk", 4, 13.21));
        list.addItem(new ChristopherTroinaGroceryItemOrder("Egg", 1, .05));
        list.addItem(new ChristopherTroinaGroceryItemOrder("$375", 10, 0));
        System.out.print(list);
    }
}
