class Solution {
    public void rotate(int[][] matrix) {
        // 00  01  02  03
        // 10  11  12  13
        // 20. 21  22. 23
        // 30. 31. 32. 33
        int temp =0;
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix.length; j++){
                temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for(int i=0; i<matrix.length; i++){
            reverse(matrix[i]);
        }
    }

    void reverse(int[] matrix){
        int left = 0;
        int right = matrix.length -1;
        
        while(left<right){
            int temp = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = temp;
            left++;
            right--;
        }
    }
}