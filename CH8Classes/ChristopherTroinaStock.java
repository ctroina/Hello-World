package CH8Classes;

public class ChristopherTroinaStock {
    private String symbol;
    private double totalCost;
    private int shares;
    private int[] date;
    private int[] time;
    private double percentChange;
    public ChristopherTroinaStock(String symbol, double totalCost, int shares){
        this.symbol=symbol;
        this.totalCost=totalCost;
        this.shares=shares;
    }
    public void buy(int shares, double value){
        this.shares+=shares;
        totalCost+=value;
    }
    public String toString(){
        return symbol+":\nTotal Cost: $"+totalCost+"\nShares: "+shares;
    }
}
