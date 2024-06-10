class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x = x;
        this.y =y;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean visitedGrid[][] = new boolean[m][n];
        Queue<Pair> queue = new LinkedList<>();
        int timeCount[] ={0};
        int nRow[] = {-1, 0,1,0};
        int nCol[] = {0,1,0,-1};
        int count =0;

         for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0 || grid[i][j] == 2){
                    count++;
                }
                
            }
        }

        if(count == m*n){
            return 0;
        }



        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    visitedGrid[i][j] = true;
                    queue.add(new Pair(i,j));
                }
                
            }
        }

        findTotalTime(timeCount, m,n, grid, visitedGrid, queue, nRow, nCol);

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
                
            }
        }

        
            
        
        return timeCount[0];
    }

    void  findTotalTime(int timeCount[], int m, int n, int[][] grid, boolean visitedGrid[][], Queue<Pair> queue, int nRow[], int nCol[]) {
        while(!queue.isEmpty()){
                int size = queue.size();
                for(int p=0; p<size; p++){
                    Pair poppedNode = queue.poll();
                    int currentRow = poppedNode.x;
                    int currentCol = poppedNode.y;

                    for(int i=0; i<nRow.length; i++){
                        int adjRow = currentRow + nRow[i];
                        int adjCol = currentCol + nCol[i];

                        if(adjRow>=0 && adjRow < m && adjCol >=0 && adjCol <n && visitedGrid[adjRow][adjCol] == false && grid[adjRow][adjCol] == 1){
                            visitedGrid[adjRow][adjCol] = true;
                            grid[adjRow][adjCol] = 2;
                            queue.add(new Pair(adjRow, adjCol));
                        }
                    } 
                }
                if(!queue.isEmpty()){
                    timeCount[0]++;
                }
                
        }
    }
}

// 2 2 2
// 0 2 2
// 1 0 2