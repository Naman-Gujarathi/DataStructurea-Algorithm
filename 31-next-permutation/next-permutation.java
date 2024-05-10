class Solution {
    public void nextPermutation(int[] nums) {
        // find the dip index i from the last 
    
       
        // reverse the remaining from i+1 to n-1
        // 1 2 3
        int dip = -1;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i-1] < nums[i]) {
                    dip = i-1;
                    break;
            }
        }
      

        // special condiiton if there is no dip it mean number is highest so return reverse
            if(dip == -1) {
                reverse(nums, 0, nums.length-1);
                return;
            }

            for(int i=nums.length-1; i>dip; i--){
            if(nums[i]> nums[dip]){
                int temp = nums[dip];
                nums[dip] = nums[i];
                nums[i] = temp;
               
                break;
            }
            
        
        }
         // find the element which is ceiling of dip index elemlent and swap(Array is already in descending so find first element)
        reverse(nums, dip+1, nums.length-1);
        // int last =(nums.length-1 - (dip))/2;
        // for(int i=0; i<last; i++){
        //         int temp = nums[dip+1+i];
        //         nums[dip+1+i] = nums[nums.length-1-i];
        //         nums[nums.length-1-i] = temp;
        // }

        
    }

    void reverse(int nums[], int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}