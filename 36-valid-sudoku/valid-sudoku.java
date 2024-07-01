class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (!ifValid(i, j, board, board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean ifValid(int row, int col, char[][] board, char target) {
        for (int i = 0; i <= 8; i++) {
            if (board[i][col] == target && i != row) {
                return false;
            }
            if (board[row][i] == target && i != col) {
                return false;
            }
            int currRow = 3 * (row / 3) + i / 3;
            int currCol = 3 * (col / 3) + i % 3;
            if ((currRow != row && currCol != col) && board[currRow][currCol] == target) {
                return false;
            }
        }
        return true;
    }
}
