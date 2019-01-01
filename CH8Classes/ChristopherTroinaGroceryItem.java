package CH8Classes;
/**
 * ChristopherTroinaGroceryItem, represents a number of a certain grocery item to be ordered
 * @author Christopher Troina
 */
public class ChristopherTroinaGroceryItem {
    //state fields
    private String name;
    private int quantity;
    private double ppu;

    /**
     * Creates a new ChristopherTroinaGroceryItemOrder object.
     * @param name, the name of the grocery item.
     * @param quantity, how many items are being ordered
     * @param ppu, the price of one of the item, gets rounded to the nearest hundredth.
     */
    public ChristopherTroinaGroceryItem(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = Math.round(ppu*100.0)/100.0;
    }

    /**
     * Changes the quantity of the items.
     * @param quantity the new quantity to be set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates the cost of the entire quantity of the item
     * @return the total cost of the item quantity, rounded to the nearest hundredth.
     */
    public double getCost() {
        return Math.round((ppu*quantity)*100.0)/100.0;
    }

    /**
     * Puts the name, price per unit, and quantity of the item into a String.
     * @return the created String.
     */
    public String toString(){
        return name+"\n"+quantity+"\n"+ppu;
    }
}
