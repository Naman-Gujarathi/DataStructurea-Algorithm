package DynamicProgramming;
import java.util.*;

public class MinimumPathSum {

 void minPath (int [][] grid, int up, int right, int[] minPathCost, int currentPath) {

        if(up == grid.length-1 && right== grid[0].length-1 ) {
            currentPath =currentPath + grid[up][right];
            minPathCost[0]=Math.min(currentPath, minPathCost[0]);
            
            return ;
        }

        if(right >= grid[0].length || up >= grid.length) {
            return ;
        }

        // currentPath =currentPath + grid[up][right];

        minPath(grid, up+1, right, minPathCost, currentPath + grid[up][right] );
        minPath(grid, up, right +1, minPathCost, currentPath + grid[up][right] );


    }


    public static void main (String args[]) {
        MinimumPathSum obj = new MinimumPathSum();
        int up =0;
        int right=0;
        int grid[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value for grid 4*4");
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
               grid[i][j] = sc.nextInt();
            }
        }
        int[] minPathCost = new int[1];
        minPathCost[0] =Integer.MAX_VALUE;
        int currentPath =0;
        obj.minPath(grid, up, right, minPathCost, currentPath);
        System.out.println("minPathCost " +minPathCost[0]);
    }
    
}
