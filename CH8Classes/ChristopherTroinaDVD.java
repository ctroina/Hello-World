package CH8Classes;

/**
 * ChristopherTroinaDVD, represents a DVD or Blu-Ray disk in a movie collection.
 * @author Christopher Troina
 */
public class ChristopherTroinaDVD {
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;

    /**
     * Creates a new ChristopherTroinaDVD object.
     * @param title, the name of the film.
     * @param director, the director of the film.
     * @param year, the year the film came out.
     * @param cost, the cost of the DVD/Blu-Ray disk.
     * @param blueray, states if the film is on a Blu-Ray disk or not.
     */
    public ChristopherTroinaDVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = Math.round(cost*100.0)/100.0;
        this.blueray = blueray;
    }
    public String toString(){
        String string="$"+cost+"\n"+year+"\n"+title+"\n"+director;
        if(blueray)
            string+="\nBlu-Ray\n";

        return string;
    }
}
