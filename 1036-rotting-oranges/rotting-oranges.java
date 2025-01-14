class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<Pair> queue = new LinkedList<>();
        int m = grid.length-1;
        int n = grid[0].length-1;
        int timeCount = 0;
        int currentRow = 0;
        int currentCol = 0;

        for(int i=0; i<=m ; i++){
            for(int j=0; j<=n; j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i, j));
                }
            }
        }

        System.out.println("initialSize" + queue.size());

        timeCount = bfs( currentRow, currentCol, queue, grid, m, n, timeCount); 
        System.out.println("timeCount" + timeCount);

        for(int i=0; i<=m ; i++){
            for(int j=0; j<=n; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }

        return timeCount;
    }

    int bfs(int currentRow, int currentCol ,Queue<Pair> queue,int[][] grid, int m, int n, int timeCount){

        while(!queue.isEmpty()){
            int size = queue.size();
            System.out.println("size" + size);
            for(int i=0; i<size; i++){
               Pair coordinates = queue.poll();
               currentRow = coordinates.x;
               currentCol = coordinates.y;
               System.out.println("x: " + coordinates.x + " y: " + coordinates.y);


               int adjRow[] = {0, 1, 0, -1};
               int adjCol[] = {-1, 0, 1, 0};

               for(int j=0; j<adjRow.length; j++){
                    int neighbourRow = adjRow[j] + currentRow;;
                    int neighbourCol = adjCol[j] + currentCol;
                     System.out.println("neighbourRow: " + neighbourRow + " neighbourCol: " + neighbourCol);

                    if(neighbourRow >= 0 && neighbourCol >= 0 && neighbourRow <= m && neighbourCol <= n && grid[neighbourRow][neighbourCol] == 1 ){
                         grid[neighbourRow][neighbourCol] = 2;
                         queue.add(new Pair(neighbourRow, neighbourCol));
 
                    }

               }

            }
            if(queue.size() != 0){
                 timeCount++;
            }
           
        }
        return timeCount;
    }



}