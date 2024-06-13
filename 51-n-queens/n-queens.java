class Solution {
    public List<List<String>> solveNQueens(int n) {
        // int grid[][] = new int[n][n]; // created a grid of size n into n
        List<String> currentList = new ArrayList<>(); // to store ..Q. string
        List<List<String>> resultList = new ArrayList<>(); // to store result
        boolean coloumn[] = new boolean[n];// to check for coloumn if queen can be placed there or not
        int row =0; // to move to next row
        boolean belowDiagonal[] = new boolean[(2*n)-1]; // to verify diagonal if it comes in Queen Way direction = /
        boolean aboveDiagonal[] = new boolean[(2*n)-1]; // to verify other diagonal if it comes in Queen Way direction = \
        findAllCombination(row, coloumn, belowDiagonal, aboveDiagonal, n, currentList, resultList); // recursion
        return resultList; // return result
    }

        void findAllCombination( int row,  boolean coloumn[], boolean belowDiagonal[], boolean aboveDiagonal[], int n, List<String> currentList, List<List<String>> resultList){
            // if condition satisfy it mean that it can be added to resultList
            if(row == n){
                resultList.add(new ArrayList<>(currentList));
                return;
            }
          
                for(int j=0; j<n; j++){
                   if( isSafe(row, j, belowDiagonal, aboveDiagonal, coloumn,n)){
                      coloumn[j] = true;
                      belowDiagonal[row + j] = true;
                      aboveDiagonal[(j - row) + (n-1)] = true;
                       StringBuffer sb = new StringBuffer();
                        for(int s=0; s<n; s++){
                            if(s == j){
                                sb.append("Q");
                            } else {
                                sb.append(".");
                            }
                        }
                         currentList.add(sb.toString());
        findAllCombination(row + 1, coloumn, belowDiagonal, aboveDiagonal,  n, currentList, resultList);
                          currentList.remove(currentList.size()-1);
                          coloumn[j] = false;
                          belowDiagonal[row + j] = false;
                          aboveDiagonal[(j - row) + (n-1)] = false;
                   }
                     
                }
            
        }

        boolean isSafe(int currRow, int currCol, boolean belowDiagonal[], boolean aboveDiagonal[], boolean coloumn[], int n){
            if(coloumn[currCol] == true){
                return false;
            }
            if(belowDiagonal[currRow + currCol] == true){
                return false;
            }
            if(aboveDiagonal[(currCol - currRow) + (n-1)] == true){
                return false;
            }
            return true;
        }
}