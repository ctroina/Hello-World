package CH8Classes;

public class ChristopherTroinaGroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;
    public ChristopherTroinaGroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return pricePerUnit;
    }
    public String toString(){
        return name+": Quantity: "+quantity+" Price Per Unit: "+pricePerUnit;
    }
}
