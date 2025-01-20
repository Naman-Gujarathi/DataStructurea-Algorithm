class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++){
            if(findTarget( matrix[i], target)){
                return true;
            }  
        } 
        return false;    
    }

     boolean findTarget(int arr[], int target){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                right = mid -1;
            }else {
                left = mid +1;
            }
        }
        return false;
    }


}