package CH8Classes;

public class ChristopherTroinaMovies {
    public static void main(String[] args){
        ChristopherTroinaDVDCollection collection=new ChristopherTroinaDVDCollection();
        collection.addDVD("The Godfather","Francis Ford Coppala", 1972,24.95, true);
        collection.addDVD("District 9","Neil Blomkamp", 2009,19.95, false);
        collection.addDVD("Iron Man","Jon Favreau", 2008,15.95, false);
        collection.addDVD("All About Eve","Joseph Mankiewicz", 1950,17.50, false);
        collection.addDVD("The Matrix","Andy & Lana Wachowski", 1999,19.95, true);
        collection.addDVD("Iron Man 2","Jon Favreau", 2010,22.99, false);
        collection.addDVD("Casablanca","Michael Curtiz", 1942,19.95, false);
        collection.addDVD("The Room","Tommy Wiseau", 2003,.50, false);
        collection.addDVD("Super Mario Bros.","Annabel Jankel & Rocky Morton", 1993,.05, true);
        collection.addDVD("Cool Cat Saves the Kids","Derek Savage", 2015,.02, false);
        System.out.println(collection);
    }
}
