//this program takes user input and makes randomized groups of two teams and prints them out.
package CH7;

import java.util.Scanner;

public class ChristopherTroinaRandomHatV2 {
    public static void main(String[] Args) {
        scan();
    }
    //this method scans for user input
    public static void scan() {
        Scanner console = new Scanner(System.in);
        //takes user input
        System.out.print("Enter an even number of teams: ");
        //sets n to number entered by user
        int n = console.nextInt();
        //catches odd numbers and numbers that are too low
        while (n / 2 == (n - 1) / 2 || n <= 0) {
            if (n <= 1)
                System.out.print("The number must be two or greater.\nEnter a valid value: ");
            else
                System.out.print("The number must be even.\nEnter a valid value: ");
            n = console.nextInt();
        }
        numGen(n);
    }


    public static void numGen(int n) {
        //this method generates the groups of teams
        int[] nums=new int[n+1];
        //creates an integer array and fills it with numbers 1-n.
        for(int i=1;i<=n;i++)
            nums[i]=i;
        //creates num int to store random number
        int num=0;
        //creates an integer array to store randomly generated numbers
        int[] teams=new int[n];
        num=(int) (Math.random() * n) + 1;
        //sets teams[0] to num
        teams[0]=num;
        //sets nums to zero at the id of the randomly generated numbers
        nums[num]=0;
        //repeats setting random number until nums[num] isn't zero
        do {
            num = (int) (Math.random() * n) + 1;
        }while(nums[num]==0);
        teams[1]=num;
        nums[num]=0;
        //prints first two teams
        System.out.println(teams[0]+" & "+teams[1]);
        //repeats for the rest of the teams
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