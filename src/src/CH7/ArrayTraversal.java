package CH7;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args){
        int[] arr={11, 42, -5, 27, 0, 89};
        int[] arr2=Arrays.copyOf(arr, arr.length);
        System.out.println("Before Abby's algorithm: "+Arrays.toString(arr));
        arr=abbysAlgorithm(arr);
        System.out.println("After Abby's algorithm: "+Arrays.toString(arr));
        System.out.println("\nBefore Jonny's algorithm: "+Arrays.toString(arr2));
        arr2=jonnysAlgorithm(arr2);
        System.out.println("After Jonny's algorithm: "+Arrays.toString(arr2));
    }
    public static int[] jonnysAlgorithm(int[] ja){
        for(int i=0;i<ja.length/2;i++){
            int temp=ja[i];
            ja[i]=ja[ja.length-i-1];
            ja[ja.length-i-1]=temp;
        }
        return ja;
    }
    public static int[] abbysAlgorithm(int[] aa){
        int[] temp=new int[aa.length];
        for(int i=0;i<aa.length;i++)
            temp[i]=aa[aa.length-i-1];
        aa=temp;
        return aa;
    }
}
