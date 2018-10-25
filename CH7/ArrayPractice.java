package CH7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        /*int[] numbers=new int[10];
        numbers[0]=1;
        for(int i=1;i<=9;i++){
            numbers[i]=i+1;
        }
        for(int i=0;i<=9;i++){
            System.out.println(numbers[i]);
        }*/
        /*int[] numbers = new int[5];
        //An integer array of size 5
        System.out.println(Arrays.toString(numbers));
        //before populating the array
        for (int i = 0; i <= 4; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
        //after populating the array
        int[] numbers2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2));
        randomArray();*/
        System.out.println("Most frequent: "+modeV1(669260267));
        System.out.println("Most frequent: "+modeV2(669260267));
        String[] names={"name","again","gain","no","Name3"};
        namesBackwards(names);

}

    public static void randomArray() {
        int length = (int) (Math.random() * 10) + 1;
        int[] nums = new int[length];
        for (int i = 0; i < length; i++)
            nums[i] = (int) (Math.random() * 10) + 1;
        System.out.println("Random Array: " + Arrays.toString(nums));
        Scanner console = new Scanner(System.in);
        randomArray(console);
    }

    public static void randomArray(Scanner console) {
        System.out.print("How many numbers? ");
        int length = console.nextInt();
        System.out.print("Max value ");
        int max = console.nextInt();
        System.out.print("Min value ");
        int min = console.nextInt();
        int range = (max - min) + 1;
        int[] nums = new int[length];
        for (int i = 0; i < length; i++)
            nums[i] = (int) (Math.random() * range) + min;
        System.out.println("Random Array: " + Arrays.toString(nums));
    }

    public static int modeV1(int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0)
                count0++;
            else if (digit == 1)
                count1++;
            else if (digit == 2)
                count2++;
            else if (digit == 3)
                count3++;
            else if (digit == 4)
                count4++;
            else if (digit == 5)
                count5++;
            else if (digit == 6)
                count6++;
            else if (digit == 7)
                count7++;
            else if (digit == 8)
                count8++;
            else
                count9++;
            n/=10;
        }
        int finmax=Math.max(count0, Math.max(count1, Math.max(count2, Math.max(count3, Math.max(count4,Math.max(count5, Math.max(count6, Math.max(count7, Math.max(count8, count9)))))))));
        if (finmax == count0)
            return 0;
        else if (finmax == count1)
            return 1;
        else if (finmax == count2)
            return 2;
        else if (finmax == count3)
            return 3;
        else if (finmax == count4)
            return 4;
        else if (finmax == count5)
            return 5;
        else if (finmax == count6)
            return 6;
        else if (finmax == count7)
            return 7;
        else if (finmax == count8)
            return 8;
        else
            return 9;
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
    public static void namesBackwards(String[] names){
        String[] a=Arrays.copyOf(names, names.length);
        for(int i=0;i<a.length/2;i++){
            String temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(a));
    }

}


