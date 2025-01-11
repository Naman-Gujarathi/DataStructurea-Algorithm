class Solution {
    public int numIslands(char[][] grid) {
        // boolean visitedArray[][] = new boolean[grid.length][grid[0].length];
        int countIslands =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    countIslands++;
                    findIsland(i,j, grid);
                }
                continue;
            }
        }

        return countIslands;

       
    }

    void findIsland(int row, int col, char[][] grid){
        int adjRow[] = {0, 1, 0, -1};
        int adjCol[] = {-1, 0, 1, 0};

        for(int i=0; i<adjRow.length; i++){
            int neighbourRow = row + adjRow[i];
            int neighbourCol = col + adjCol[i];

            if(neighbourRow >= 0 && neighbourCol >= 0 && neighbourRow < grid.length && neighbourCol < grid[0].length && grid[neighbourRow][neighbourCol] == '1'){
                grid[neighbourRow][neighbourCol] = '2';
                findIsland(neighbourRow,neighbourCol, grid);
            }

            continue;
            
        }
    }

    


}