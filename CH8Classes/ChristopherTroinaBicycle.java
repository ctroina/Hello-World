package CH8Classes;

public class ChristopherTroinaBicycle {
	private boolean isPurchased;
	private String condition;
	private double psi;
	private int wheels;
	private int size;
	private String color;
	private int gears;
	private double rpm;
	private boolean isBreaking;
	private double price;
	private double speed;
	public ChristopherTroinaBicycle(String condition, boolean isPurchased, int size, double price, String color) {
		this.condition=condition;
		this.isPurchased=isPurchased;
		this.size=size;
		this.price=price;
		this.color=color;
		wheels=2;
	}
	public ChristopherTroinaBicycle(String condition, boolean isPurchased, int size, double price, String color, int gears) {
		this.condition=condition;
		this.isPurchased=isPurchased;
		this.size=size;
		this.price=Math.round(price*100.0)/100.0;
		this.color=color;
		this.gears=gears;
		wheels=2;
	}
	public void buy() {
		if(isPurchased) 
			System.out.println("You already bought the bike.");
		else
			isPurchased=true;
	}
	public void sell(double price) {
		if(isPurchased) {
			this.price=Math.round(price*100.0)/100.0;
			isPurchased=false;
			condition="used";
		}
		else
			System.out.println("You can't sell something you never bought.");
	}
	public void breaking() {
		isBreaking=true;
		speed=0;
	}
	public void releaseBreak() {
		if(isBreaking)
			isBreaking=false;
		else
			System.out.println("You're not even breaking.");
	}
	public void speedUp(double speedChange) {
		if(isBreaking)
			System.out.println("You can't move if you're breaking.");
		else
			speed+=speedChange;
	}
	public void slowDown(double speedChange) {
		if(speed-speedChange<0)
			System.out.println("You can't have negative speed.");
		else
			speed-=speedChange;
	}
	public void setCondition(String condition) {
		this.condition=condition;
	}
	public void setGears(int gears) {
		this.gears=gears;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getCondition() {
		return condition;
	}
	public int getGears() {
		return gears;
	}
	public String getColor() {
		return color;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
	    String bike="";
	    if(Character.toString((color.charAt(0))).equalsIgnoreCase("a")||
                Character.toString((color.charAt(0))).equalsIgnoreCase("e")||
                Character.toString((color.charAt(0))).equalsIgnoreCase("i")||
                Character.toString((color.charAt(0))).equalsIgnoreCase("o")||
                Character.toString((color.charAt(0))).equalsIgnoreCase("u"))
	        bike+="An ";
	    else
	        bike+="A ";
		bike+=color+" bicycle of size "+size+" in "+condition+" condition";
		if(isBreaking)
			bike+=" currently breaking";
		else if(speed==0)
			bike+=" currently stopped";
		else
			bike+=" currently moving at "+speed+"mph";
		bike+=" with "+gears+" gears.";
		if(isPurchased)
			bike+=" This bike is not for sale.";
		else
			bike+=" This bike is on sale for $"+price+".";
		return bike;
	}
}