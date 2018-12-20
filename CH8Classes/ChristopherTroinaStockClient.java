package CH8Classes;

public class ChristopherTroinaStockClient {
    public static void main(String[] args) {
        ChristopherTroinaStock stock = new ChristopherTroinaStock("STOK");
        stock.buy(100,1000.99);
        System.out.println(stock.profit(2000.99));
        System.out.println(stock);
    }

}
