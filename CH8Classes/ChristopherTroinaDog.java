package CH8Classes;

public class ChristopherTroinaDog {
    private int height;
    private int length;
    private int weight;
    private int age;
    private String breed;
    private boolean isWalking;
    private boolean isSleeping;
    public ChristopherTroinaDog(int height, int length, int weight, int age, String breed){
        this.height=height;
        this.length=length;
        this.weight=weight;
        this.age=age;
        this.breed=breed;
    }
    public void grown(int heightChange, int lengthChange, int ageChange){
        if(heightChange<0)
            System.out.println("Height change can't be negative");
        else
            height+=heightChange;
        if(lengthChange<0)
            System.out.println("Length change can't be negative");
        else
            length+=lengthChange;
        if(ageChange<0)
            System.out.println("Age change can't be negative");
        else
            age+=ageChange;
    }

    public void setWalking(boolean walking) {
        isWalking = walking;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isWalking() {
        return isWalking;
    }

    public boolean isSleeping() {
        return isSleeping;
    }
    public String toString(){
        String dog="";
        if(Character.toString((breed.charAt(0))).equalsIgnoreCase("a")||
                Character.toString((breed.charAt(0))).equalsIgnoreCase("e")||
                Character.toString((breed.charAt(0))).equalsIgnoreCase("i")||
                Character.toString((breed.charAt(0))).equalsIgnoreCase("o")||
                Character.toString((breed.charAt(0))).equalsIgnoreCase("u"))
            dog+="An ";
        else
            dog+="A ";
        dog+=breed+", "+height+" feet tall, "+length+" feet wide, "+weight+"lbs, and "+age+" years old.";
        if(isWalking&&isSleeping)
            dog+=" Is currently sleep walking.";
        else if(isWalking)
            dog+=" Is currently walking.";
        else if(isSleeping)
            dog+=" Is currently sleeping.";

        return dog;
    }
}
