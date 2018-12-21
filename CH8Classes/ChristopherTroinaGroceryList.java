package CH8Classes;
//This class simulates a grocery list
public class ChristopherTroinaGroceryList {
    //state fields
    public static final int MAX_ITEMS=10;
    private ChristopherTroinaGroceryItemOrder[] list;
    private int numItems;
    //constructor
    public ChristopherTroinaGroceryList(){
        list=new ChristopherTroinaGroceryItemOrder[MAX_ITEMS];
        numItems=0;
    }
    //behaviors
    public double getTotalCost() {
        double totalCost=0;
        for(int i=0;i<numItems;i++){
            totalCost+=list[i].getCost();
        }
        return Math.round(totalCost*100.0)/100.0;
    }
    public void addItem(ChristopherTroinaGroceryItemOrder item){
        if(numItems>=MAX_ITEMS)
            System.out.println("List is too large. Cannot add another item.");
        else {
            list[numItems] = item;
            numItems++;
        }
    }
    public String toString(){
        String listst="My Grocery List:\n\nNumber of Items: "+numItems+"\nTotal Cost: $"+getTotalCost()
                +"\n\nDVD list\n\n";
        for(int i=0;i<numItems;i++){
            listst+=list[i].toString();
        }
        return listst;
    }
}
