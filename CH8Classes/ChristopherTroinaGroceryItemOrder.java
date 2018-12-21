package CH8Classes;
//this program simulates grocery items which will be part of a grocery list
public class ChristopherTroinaGroceryItemOrder {
    //state fields
    private String name;
    private int quantity;
    private double ppu;
    //constructor
    public ChristopherTroinaGroceryItemOrder(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = Math.round(ppu*100.0)/100.0;
    }
    //behaviors
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //gets the total cost of the item
    public double getCost() {
        return Math.round((ppu*quantity)*100.0)/100.0;
    }
    public String toString(){
        return "$"+ppu+"\t"+quantity+"\t"+name+"/t$"+getCost()+"\n";
    }
}
