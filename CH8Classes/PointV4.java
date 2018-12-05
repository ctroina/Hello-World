package CH8Classes;
//This class is a template to represent a point on a coordinate plane
public class PointV4 {
    private int x;
    private int y;
    //behaviors below (methods)
    //A constructor doesn't have a return type, and it gets called implicitly when an object is created.
    public PointV4(int x, int y){
        this.x=x;
        this.y=y;
    }
    public PointV4(){
        x=0;
        y=0;
    }
    public int getX(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void translate(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    public void setLocation(int newx, int newy){
        x=newx;
        y=newy;
    }
    public double distance(PointV4 p2){
        double dx=x-p2.x;
        double dy=y-p2.y;
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }
    public double distanceFromOrigin(){
        return Math.sqrt(Math.pow((double)x,2)+Math.pow((double)y,2));
    }
    //overriding the built in toString method to print the contents of the object
    public String toString() {
        return ("(" + x + ", " + y + ")");
    }
}
