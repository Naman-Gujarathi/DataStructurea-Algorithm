class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       
        List<Integer> resultList = new ArrayList<>();
        if(matrix.length == 0){
            return resultList;
        }
        int left =0;
        int right = matrix[0].length-1;
        int row = 0;
        int bottomRow = matrix.length -1;
        while(left <= right && row <= bottomRow){
            for(int i = left; i<= right; i++){
                resultList.add(matrix[row][i]);
            }
            row++;
            
            for(int j= row; j<= bottomRow; j++) {
                 resultList.add(matrix[j][right]);
            }
            right--;

            if(row <= bottomRow){
                 for(int k = right; k >= left; k--) {
                 resultList.add(matrix[bottomRow][k]);
                }

            bottomRow--;
            }

           
            if(left <= right){
                 for(int l= bottomRow; l>= row; l--) {
                 resultList.add(matrix[l][left]);
                  }
            left++;
            }
    
        }

        return resultList;
    }
}