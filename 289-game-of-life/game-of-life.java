class Solution {
    public void gameOfLife(int[][] board) {
        int game[][] = new int[board.length][board[0].length];
        int row[] = {-1, -1, -1, 0, 1, 1, 1, 0};
        int col[] = {-1, 0, 1, 1, 1, 0, -1, -1};

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                    gameForLife(i, j, row, col, board, game);
            }
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                    board[i][j] = game[i][j];
            }
        }
        

    }

    void gameForLife( int currRow, int currCol, int row[], int col[], int [][]board, int [][] game){
        int count =0;
        for(int i=0; i<row.length; i++){

            int adjRow = currRow + row[i];
            int adjCol = currCol + col[i];
            

            if(adjRow >=0 && adjRow < board.length && adjCol >=0 && adjCol< board[0].length) {
                if(board[adjRow][adjCol] == 1){
                    count++;
                }
            }
        }

        if(board[currRow][currCol] == 1){
            if(count == 2 || count == 3){
                game[currRow][currCol] = 1;
            }else{
                 game[currRow][currCol] = 0;
            }
        }
        else if(board[currRow][currCol] == 0){
            if(count == 3){
                game[currRow][currCol] = 1;
            }else{
                 game[currRow][currCol] = 0;
            }
        }
    }
}