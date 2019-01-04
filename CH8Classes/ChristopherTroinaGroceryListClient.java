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
        ChristopherTroinaGroceryList list=new ChristopherTroinaGroceryList();
        list.addItem(new ChristopherTroinaGroceryItem("Napkins", 2, 5));
        list.addItem(new ChristopherTroinaGroceryItem("Ham", 10, 15));
        list.addItem(new ChristopherTroinaGroceryItem("Turkey", 15, 10));
        list.addItem(new ChristopherTroinaGroceryItem("Wrapping Paper", 3, 19.99));
        list.addItem(new ChristopherTroinaGroceryItem("Sugar", 1, 16.55));
        list.addItem(new ChristopherTroinaGroceryItem("Tape", 4, 3));
        list.addItem(new ChristopherTroinaGroceryItem("Cheese", 1, 1999.99));
        list.addItem(new ChristopherTroinaGroceryItem("Milk", 4, 13.21));
        list.addItem(new ChristopherTroinaGroceryItem("Egg", 1, .05));
        list.addItem(new ChristopherTroinaGroceryItem("$375", 10, 0));
        System.out.print(list);
    }
}
