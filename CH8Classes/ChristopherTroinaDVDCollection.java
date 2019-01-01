package CH8Classes;

import java.util.Arrays;
import java.util.Scanner;

public class ChristopherTroinaDVDCollection {
    private ChristopherTroinaDVD[] collection;
    private int count;
    private double totalCost;
    public ChristopherTroinaDVDCollection(){
        collection=new ChristopherTroinaDVD[5];
        count=0;
    }
    public void addDVD(String title, String director, int year, double cost, boolean blueray){
        if(count==collection.length)
            increaseSize();
        collection[count]=new ChristopherTroinaDVD(title, director, year, cost, blueray);
        count++;
        totalCost+=cost;
        totalCost=Math.round(totalCost*100.0)/100.0;
    }
    private void increaseSize(){
        collection=Arrays.copyOf(collection, collection.length+5);
    }
    public String toString(){
        String averageCost="$"+Math.round((totalCost/(double)count)*100.0)/100.0;
        String centsAv=averageCost.substring(averageCost.indexOf('.'));
        //adds a zero to the end of the average cost if it ends in zero.
        if(centsAv.length()==2)
            averageCost+="0";
        String totalST="$"+totalCost;
        String centsT=totalST.substring(totalST.indexOf('.'));
        //adds a zero to the end of the price if it ends in zero.
        if(centsT.length()==2)
            totalST+="0";
        String string="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nMy DVD Collection\n\nNumber of DVDs: "+count+
                "\nTotal cost: "+totalST+"\nAverage cost: " +averageCost+"\n\nDVD List:\n\n";
        final Object[][] table = new String[count][];
        for(int i=0;i<count;i++) {
            String dvd=collection[i].toString();
            Scanner scan=new Scanner(dvd);
            String cost=scan.nextLine();
            String year=scan.nextLine();
            String title=scan.nextLine();
            String director=scan.nextLine();
            boolean bluray=false;
            if(scan.hasNextLine())
                bluray=true;
            String cents=cost.substring(cost.indexOf('.'));
            //adds a zero to the end of the cost if it ends in zero.
            if(cents.length()==2)
                cost+="0";
            if(bluray)
                table[i] = new String[]{cost, year, title, director, "Blu-Ray"};
            else
                table[i] = new String[]{cost, year, title, director, ""};
        }
        for (final Object[] row : table) {
            //adds the table to the string to be returned
            string+=string.format("%-8s%-8s%-25s%-30s%-45s\n", row);
        }
        return string;
    }
}
