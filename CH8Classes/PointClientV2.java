package CH8Classes;

public class PointClientV2 {
    public static void main(String[] args){
        PointV2 p1=new PointV2();
        System.out.println("p1: "+p1);
        p1.x=3;
        p1.y=6;
        System.out.println("p1': "+p1);
        PointV2 p2=new PointV2();
        p2.x=7;
        p2.y=25;
        System.out.println(p1.distance(p2));
        System.out.println(p1.distanceFromOrigin());
        //PointV2 p1=new PointV2(3,6);
        //System.out.println("p1 is "+p1);
    }
}
