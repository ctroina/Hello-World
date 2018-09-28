package CH7;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] arr={11, 42, -5, 27, 0, 89};
        abbysAlgorithm(arr);

    }
    public static void jonnysAlgorithm(int[] ja){
        for(int i=0;i<ja.length/2;i++){
            int temp=ja[i];

        }
    }
    public static void abbysAlgorithm(int[] aa){
        int[] temp=new int[aa.length];
        for(int i=0;i<aa.length;i++)
            temp[i]=aa[aa.length-i-1];
        aa=temp;
        System.out.println(Arrays.toString(temp));
    }
}
