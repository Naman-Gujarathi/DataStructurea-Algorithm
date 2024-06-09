class Solution {
    public int numIslands(char[][] grid) {

    int m = grid.length;
    int n = grid[0].length;
    boolean visitedNode[][] = new boolean[m][n];
    int countIsland =0;
    int nRow[] = {0, 1, 0, -1};
    int nCol[] = {1, 0, -1, 0};

    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if( grid[i][j] == '1' && !visitedNode[i][j]) {
                 visitedNode[i][j] = true;
                countIsland++;
                findNumberIsland(visitedNode, grid, i, j, nRow, nCol, m, n);
            }
        }
    }

    return countIsland;

    }

    void findNumberIsland(boolean visitedNode[][], char[][] grid, int currRow, int currCol, int nRow[], int nCol[], int m, int n ){
         
        for(int i=0; i<nRow.length; i++){
            int adjRow = currRow + nRow[i];
            int adjCol = currCol + nCol[i];

            if(adjRow >= 0 && adjRow < m && adjCol >= 0 && adjCol < n && visitedNode[adjRow][adjCol] == false && grid[adjRow][adjCol] == '1' ){
                 visitedNode[adjRow][adjCol] = true;
                findNumberIsland(visitedNode, grid, adjRow, adjCol, nRow, nCol, m, n);
            }
        }

    }
}