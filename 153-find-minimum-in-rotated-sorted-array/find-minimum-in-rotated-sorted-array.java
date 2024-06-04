class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            int mid = (left + right)/2;
            min = Math.min(min, nums[mid]);
            if(nums[mid] >= nums[left]){
                if(min > nums[left]){
                    min = nums[left];
                }
                left = mid +1;    
            }
            else if(nums[mid] <= nums[right]){
                right = mid -1;
            }
        }

        return min;
    }
}