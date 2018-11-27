package CH8Classes;

public class PointClientV1 {
    public static void main(String[] args){
        PointV1 p1=new PointV1();
        System.out.println("p1: ("+p1.x+", "+p1.y+")");
        p1.x=3;
        p1.y=6;
        System.out.println("p1': ("+p1.x+", "+p1.y+")");
    }
}
