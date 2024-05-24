package DynamicProgramming;
import java.util.*;

public class NinjaTraining {

   int  maxPoints (int last, int day,  int[][] arr, int[][] dp) {

        if(day > arr.length-1) {
            return 0;

        }

        if(dp[day][last] != -1) {
            return dp[day][last];
        }

        int maxValue =0;
for(int i=0; i<arr[0].length; i++) {
    if(last != i) {
        int currentValue = arr[day][i] + maxPoints(i, day+1,  arr, dp);
        maxValue = Math.max(maxValue, currentValue);
      
    }
    
}
       
            
    
        System.out.println("day" + day + "maxValue" + maxValue);
      return dp[day][last] = maxValue;
      

      
    }


    public static void main (String args[]) {
        NinjaTraining obj = new NinjaTraining();
        int arr[][] = {{10,20,30}, {30,20,10}, {60,50,40}};
        int dp[][] = new int[arr.length][arr[0].length+1];
        for(int row[] : dp) {
            Arrays.fill(row, -1);

        }
       
        int last =3;
        int day =0;
        // int maxValue = Integer.MIN_VALUE;
        int result =obj.maxPoints(last, day, arr, dp);
        System.out.println("maxValue " + result);

        for(int row[] : dp) {
            for(int i: row) {
                System.out.print(" " +i);
            }
            System.out.println("");
    
        }
        

    }

    
}
