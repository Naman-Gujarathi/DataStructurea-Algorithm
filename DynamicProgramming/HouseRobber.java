package DynamicProgramming;
import java.util.*;


public class HouseRobber {

    int maxSum (int[] arr, int index, int[] dp) {

        if(index > arr.length-1) {
            return 0;

        }
        
        if(dp[index] != -1) {
            return dp[index];
        }

        if(index == arr.length-1) {
            return dp[index] = arr[arr.length-1];

        }

       

        
        int pick = arr[index] + maxSum(arr, index + 2, dp);
        int notpick = maxSum(arr, index + 1, dp);

       return dp[index] = Math.max(pick, notpick);


    }




    public static void main(String args[]) {
        HouseRobber obj = new HouseRobber();
        int arr[] = {1,2,3,4,5,6,7,8,90,50};
        int arr1[] = new int[arr.length-1];
        int arr2[] = new int[arr.length-1];
        for(int i=0 ; i<arr.length; i++) {
            if(i!=0) {
                arr1[i-1] =arr[i];
            }
            if(i<arr.length-1) {
                arr2[i] = arr[i];
            }

        }
        int index =0;
        int []dp = new int[arr.length];
        Arrays.fill(dp, -1);
        // int maximumSum[] = new int[1];
        // maximumSum[0] = Integer.MAX_VALUE;
        int maxValue1 = obj.maxSum(arr1, index, dp);
        int maxValue2 = obj.maxSum(arr2, index, dp);
        
        System.out.println("maxValue " + Math.max(maxValue1, maxValue2));
    }
    
}
