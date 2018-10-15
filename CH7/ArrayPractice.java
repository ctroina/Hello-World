package CH7;

import java.util.Arrays;
import java.util.Scanner;

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
        randomArray();
        System.out.println(mode(669260267));
    }
    public static void randomArray(){
        int length=(int)(Math.random()*10)+1;
        int[] nums=new int[length];
        for(int i=0;i<length;i++)
            nums[i]=(int)(Math.random()*10)+1;
        System.out.println("Random Array: "+Arrays.toString(nums));
        Scanner console=new Scanner(System.in);
        randomArray(console);
    }
    public static void randomArray(Scanner console){
        System.out.print("How many numbers? ");
        int length=console.nextInt();
        System.out.print("Max value ");
        int max=console.nextInt();
        System.out.print("Min value ");
        int min=console.nextInt();
        int range=(max-min)+1;
        int[] nums=new int[length];
        for(int i=0;i<length;i++)
            nums[i]=(int)(Math.random()*range)+min;
        System.out.println("Random Array: "+Arrays.toString(nums));
    }
    public static int mode(int n){
        int[] counter=new int[10];
    }
}
