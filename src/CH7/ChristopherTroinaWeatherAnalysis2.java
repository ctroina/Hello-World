package CH7;

import java.util.Arrays;
import java.util.Scanner;

/*This program takes user input and calculates the average temperature for n days. The program also identifies how many days are
above average*/
public class ChristopherTroinaWeatherAnalysis2 {
    public static void main(String[] args){
        //Step 1: Take user input for number of days and temperatures
        //Step 2: Record number of days with an array and a cumulative sum variable
        //Step 3: Calculate the average
        //Step 4: Figure out which days are above average
        //Step 5: Print results
        Scanner console= new Scanner(System.in);
        input(console);
    }
    public static void input(Scanner console){
        System.out.print("How many days' temperatures? ");
        //User input for number of days
        int days=console.nextInt();
        //Catches number lower than 2
        while(days<=1){
            System.out.print("Bad number, put in a value higher than 1. ");
            days=console.nextInt();
        }
        int[] temps=new int[days];
        //array for storing user input for temperature.
        int sum=0;
        for(int i=1;i<=days;i++) {
            //user input for temperature being stored in array, along with cumulative sum variable
            System.out.print("Day " + i + "'s high temp: ");
            temps[i - 1] = console.nextInt();
            sum+=temps[i-1];
        }
        //calling average method
        average(temps, sum, days);
    }
    public static void average (int[] temps, int sum, int days){
        //calculating the average
        double avtemp=Math.round((sum/(double)days)*10.0)/10.0;
        //printing the average
        System.out.println("Average temp = "+avtemp);
        //figuring out the days above the average
        int above=0;
        for(int i=0;i<days;i++){
            if((double)temps[i]>avtemp){
                above++;
            }
        }
        //printing amount of days above the average
        System.out.println(above+" days were above average.");
        System.out.println("\nTemperatures: "+Arrays.toString(temps));
        hotCold(temps, days);
    }
    public static void hotCold(int[] temps, int days){
        Arrays.sort(temps);
        System.out.println("Two coldest days: "+temps[0]+", "+temps[1]);
        System.out.println("Two hottest days: "+temps[days-1]+", "+temps[days-2]);
    }
}

