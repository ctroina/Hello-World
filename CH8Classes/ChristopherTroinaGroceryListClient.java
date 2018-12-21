package CH8Classes;

public class ChristopherTroinaGroceryListClient {
    public static void main(String[] args){
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
        list.addItem(new ChristopherTroinaGroceryItemOrder("Bread", 999, 1.99));
        System.out.println(list.getTotalCost());
    }
}
