package CH8Classes;

public class ChristopherTroinaTree {
    private int height;
    private int width;
    private int age;
    private boolean isAlive;
    private String species;
    public ChristopherTroinaTree(int height, int width, int age, String species){
        this.height=height;
        this.width=width;
        this.species=species;
        this.age=age;
        isAlive=true;
    }
    public void grow(int heightChange, int widthChange, int ageChange){
        if(heightChange<0)
            System.out.println("Height change can't be negative");
        else
            height+=heightChange;
        if(widthChange<0)
            System.out.println("Width change can't be negative");
        else
            width+=widthChange;
        if(ageChange<0)
            System.out.println("Age change can't be negative");
        else
            age+=ageChange;
    }
    public void notAlive() {
        isAlive=false;
    }
    public void chopDown(int heightChange){
        if(heightChange>=height)
            System.out.println("The change in height must be lower than the actual height");
        else {
            height -= heightChange;
            isAlive=false;
        }
    }
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String getSpecies() {
        return species;
    }
    public String toString(){
        String tree="A";
        if(isAlive)
            tree+=" living ";
        else
            tree+=" dead ";
        tree+=species+" tree of height "+height+" feet, of width "+width+" feet, of age "+age;
        return tree;
    }
}
