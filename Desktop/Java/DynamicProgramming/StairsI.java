package DynamicProgramming;
import java.util.*;

public class StairsI {

    int minEnergy(int arr[], int height, int []dp) {

        if(dp[height] != -1) {
            return dp[height];
        }


        if(height == 0) {
            return dp[height] =0;
        }
        
        if (height == 1) {
            return dp[height] =arr[1] - arr[0];
        }

        int energy1 = minEnergy(arr, height-1, dp) + Math.abs(arr[height] - arr[height-1]);

        int energy2 = minEnergy(arr, height-2, dp) + Math.abs(arr[height] - arr[height-2]);

        return dp[height] = Math.min(energy1, energy2);


    }


    public static void main (String args[]) {

        StairsI obj = new StairsI();
        int arr[] = {10, 20, 30, 10};
        int height= arr.length-1;
        int dp[] = new int[arr.length];
        Arrays.fill(dp, -1);
        int value =obj.minEnergy(arr, height, dp  );
        System.out.println(value);
        
    }
    
}
