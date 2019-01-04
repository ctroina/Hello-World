package CH8Classes;

/**
 * Tests the ChristopherTroinaDVD collection class.
 * @author Christopher Troina
 */
public class ChristopherTroinaMovies {
    /**
     * Creates a ChristopherTroinaDVDCollection object and adds ChristopherTroinaDVD objects to it, and then prints it.
     */
    public static void main(String[] args){
        ChristopherTroinaDVDCollection collection=new ChristopherTroinaDVDCollection();
        collection.addDVD("The Godfather","Francis Ford Coppala", 1972,24.95, true);
        collection.addDVD("District 9","Neil Blomkamp", 2009,19.95, false);
        collection.addDVD("Iron Man","Jon Favreau", 2008,15.95, false);
        collection.addDVD("All About Eve","Joseph Mankiewicz", 1950,17.50, false);
        collection.addDVD("The Matrix","Andy & Lana Wachowski", 1999,19.95, true);
        collection.addDVD("Iron Man 2","Jon Favreau", 2010,22.99, false);
        collection.addDVD("Casablanca","Michael Curtiz", 1942,19.95, false);
        System.out.println(collection);
    }
}
