package CH8Classes;

public class ChristopherTroinaGroceryList {
    private ChristopherTroinaGroceryItemOrder[] list=new ChristopherTroinaGroceryItemOrder[10];
    private double totalCost;
    private int arrayNum;
    public double getTotalCost() {
        return Math.round(totalCost*100.0)/100.0;
    }
    public void addItem(ChristopherTroinaGroceryItemOrder item){
        if(arrayNum>=10)
            System.out.println("List too large. Cannot add another item.");
        else {
            list[arrayNum] = item;
            arrayNum++;
            totalCost+=(item.getPrice()*item.getQuantity());
        }
    }

}
