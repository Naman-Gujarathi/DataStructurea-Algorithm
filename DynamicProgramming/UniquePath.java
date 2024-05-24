package DynamicProgramming;
import java.util.*;

public class UniquePath {

    int countPath( int right, int up, int[][] grid, int[][] dp) {

        if(right >= grid[0].length || up >= grid.length) {
            return 0;
        }

        if(right == grid[0].length-1 && up == grid.length-1) {
            return 1;
        }

        if(grid[right][up] == -1) {
            return 0;

        }

        if(dp[right][up] != -1) {
            return dp[right][up];
        }

            int path1Count =countPath(right +1, up, grid, dp);
            int path2Count =countPath(right, up + 1, grid, dp );

            return dp[right][up] = path1Count + path2Count;

    }



    public static void main (String args[]) {
        UniquePath obj = new UniquePath();
        System.out.println("Number of rows for a grid");
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        System.out.println("Number of coloumns for a grid");
        int coloumn =sc.nextInt();
        sc.close();
        int grid[][] = new int [row][coloumn];
        grid[0][1] = -1;
        int dp[][] = new int [grid.length][grid[0].length];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        int right =0;
        int up = 0;
        int result = obj.countPath(right, up, grid, dp);
        System.out.println("result " + result);
    }
    
}
