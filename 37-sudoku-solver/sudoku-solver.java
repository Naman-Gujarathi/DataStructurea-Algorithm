class Solution {
    public void solveSudoku(char[][] board) {
       int m = board[0].length;
       int n = board.length;
       solveBoard(board, m, n);   
    }

    boolean solveBoard(char[][] board, int m, int n){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == '.'){ // found index where I can try comnination to fill it
                     for(char c= '1'; c<='9'; c++){// hit and try number which can meet the sudoku all thre condition
                         if(isValid(i, j, c, m, n, board)){ // called function isvalid to check if number fits here or not
                             board[i][j] = c; // here c is charcter we can be placed
                             if(solveBoard(board, m, n)){
                                return true; // we got a solution for given grid
                             }
                             board[i][j] = '.'; // empty the place if couldnt find the solution try another character
                         }

                     }
                     return false; // couldnt find any answer backtrack to parent grid
                   
                }
            }
        }
        return true; // when all indexes are filled based on constraints 
    }

    boolean isValid(int currRow, int currCol, char c, int row, int col, char board[][]){
        for(int i=0; i<9; i++){// with one for loop we can check validituy for row, coloum and 3*3 grid in which it reside 
            if(board[i][currCol] == c){
                return false;
            }
            if(board[currRow][i] == c){
                return false;
            }
            if(board[3*(currRow/3) + i/3][3*(currCol/3) + i %3] == c){
                return false;
            }
               
        }
        return true;
    }

}