class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 1 && matrix[0].length == 1){
            if(target == matrix[0][0]){
                return true;
            }else{
                return false;
            }
        }
        int rowNo = -1;
        int arr[] = new int[matrix[0].length]; 
        for(int i=0; i<matrix.length; i++){
             
             if(target <= matrix[i][matrix[0].length -1]){
                rowNo = i;
                break;
             }
             
        }

        if(rowNo == -1){
            return false;
        }

        
       
        for(int i=0; i<matrix[rowNo].length; i++){
            arr[i] = matrix[rowNo][i];
       
        }
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(target < arr[mid]){
                right = mid -1;
            }else if(target > arr[mid]){
                left = mid + 1;
            }else{
                return true;
            }
        }

        return false;

    }
}