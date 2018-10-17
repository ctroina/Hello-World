package CH7;

public class ChristopherTroinaMode {
    public static void main(String[] args){
        System.out.println("Most Frequent: "+ modeV2(669260267));
    }
    public static int modeV2(int n){
        int[] count=new int[10];
        while(n>0){
            count[n%10]++;
            n/=10;
        }
        int max=count[0];
        int maxin=0;
        for(int i=1;i<count.length;i++){
            if(Math.max(max, count[i])==count[i]&&max!=count[i]){
                max=count[i];
                maxin=i;
            }
        }
        return maxin;
    }
}
