package CH7;

import java.util.Scanner;

public class ChristopherTroinaRandomHatV2 {
    public static void main(String[] Args) {
        scan();
    }

    public static void scan() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an even number of teams: ");
        int n = console.nextInt();
        while (n / 2 == (n - 1) / 2 || n <= 0) {
            if (n <= 1)
                System.out.print("The number must be two or greater. ");
            else
                System.out.print("The number must be even. ");
            n = console.nextInt();
        }
        numGen(n);
    }


    public static void numGen(int n) {
        int[] nums=new int[n+1];
        for(int i=1;i<=n;i++)
            nums[i]=i;
        int num=0;
        int[] teams=new int[n];
        num=(int) (Math.random() * n) + 1;
        teams[0]=num;
        nums[num]=0;
        do {
            num = (int) (Math.random() * n) + 1;
        }while(nums[num]==0);
        teams[1]=num;
        nums[num]=0;
        System.out.println(teams[0]+" & "+teams[1]);
        for(int i=2;i<n;i+=2){
            for(int ii=0;ii<=1;ii++) {
                do {
                    num = (int) (Math.random() * n) + 1;
                } while (nums[num] == 0);
                teams[i+ii] = num;
                nums[num] = 0;
            }
            System.out.println(teams[i]+" & "+teams[i+1]);
        }
    }
}
