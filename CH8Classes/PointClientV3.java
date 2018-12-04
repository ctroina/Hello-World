package CH8Classes;

public class PointClientV3 {
    public static void main(String[] args){
        PointV3 p1=new PointV3(3, 6);
        System.out.println("p1: "+p1);
        PointV3 p2=new PointV3(7, 25);
        System.out.println("p2: "+p2);
        PointV3 p3=new PointV3();
        System.out.println("p3: "+p3);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distanceFromOrigin());
    }
}
