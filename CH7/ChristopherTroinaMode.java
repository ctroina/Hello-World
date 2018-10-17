package CH7;
//This program finds the most frequent digit in a number and return the most frequent digit
public class ChristopherTroinaMode {
    public static void main(String[] args){
        //prints result
        System.out.println("Most Frequent: "+ mode(669260267));
    }
    public static int mode(int n){
        //counter variable for number frequency
        int[] count=new int[10];
        while(n>0){
            //fills counter variable
            count[n%10]++;
            n/=10;
        }
        //variable to store maximum value of counter variable
        int max=count[0];
        //variable to store index of maximum value of counter variable.
        int maxin=0;
        for(int i=1;i<count.length;i++){
            if(Math.max(max, count[i])==count[i]&&max!=count[i]){
                max=count[i];
                maxin=i;
            }
        }
        //returns most frequent digit
        return maxin;
    }
}