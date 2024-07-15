class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int value =1;

        int index = 0;

       

        while((left<= right) && (top<= bottom)) {

             for(int i=left; i<=right; i++){
                matrix[top][i] = value;
                value++;
              }

            top++;

            for(int i = top; i<= bottom; i++){
                matrix[i][right] = value;
                value++;
            }
            right--;

            if(top <=bottom){
                for(int i= right; i>= left; i--){
                    matrix[bottom][i] =  value;
                value++;
                }
                    bottom--;
            }
        
            if(left<= right){
                for(int i=bottom; i>=top; i--){
                    matrix[i][left] = value;
                    value++;
                }

                    left++;
            }
        }
        
        
        return matrix;
    }
}