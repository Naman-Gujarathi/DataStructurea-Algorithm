package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class fibonnaci {

    int function (int n, int[] dp) {

        if(dp[n] != -1) {
            return dp[n];
        }

        if(n<=1) {
            return dp[n] =n;
        }

       

        return dp[n] = function(n-1, dp) + function(n-2, dp);
    }

    


    public static void main (String args[]) {



        fibonnaci obj = new fibonnaci();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter nth element whose value need to be printout");
        int n = sc.nextInt();
        int dp[] = new int[n+1]; 
        Arrays.fill(dp, -1);
        int value = obj.function(n, dp);
        System.out.println("value " + value);
        // System.out.println("dp table" );
        for(int i : dp) {
            System.out.print(" " + i);
        }

        // 0 1 1 2 3 5 8


    }
    
}
