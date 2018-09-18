package CH7;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String []args){
        /*int[] numbers=new int[10];
        numbers[0]=1;
        for(int i=1;i<=9;i++){
            numbers[i]=i+1;
        }
        for(int i=0;i<=9;i++){
            System.out.println(numbers[i]);
        }*/
        int[] numbers = new int[5];
        //An integer array of size 5
        System.out.println(Arrays.toString(numbers));
        //before populating the array
        for(int i=0;i<=4;i++){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));
        //after populating the array
        int[] numbers2={1,2,3,4,5};
        System.out.println(Arrays.toString(numbers2));
    }
}
