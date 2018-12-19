package CH8Classes;

public class ChristopherTroinaStock {
    private String symbol;
    private double totalCost;
    private int shares;
    public ChristopherTroinaStock(String symbol){
        this.symbol=symbol;
    }
    public void buy(int shares, double value){
        this.shares+=shares;
        totalCost+=value;
    }
    public double profit(double currVal){
        return shares*currVal;
    }
    public String toString(){
        return symbol+":\nTotal Cost: $"+totalCost+"\nShares: "+shares;
    }
}
