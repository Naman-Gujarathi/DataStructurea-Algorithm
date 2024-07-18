class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubArraySum = Integer.MIN_VALUE;
        int currSubArraySum  = 0;

        for(int num : nums){
            currSubArraySum = currSubArraySum + num;
            maxSubArraySum = Math.max(maxSubArraySum, currSubArraySum);

           if( currSubArraySum <0){
                   currSubArraySum = 0;
           }
             
        }

        return maxSubArraySum;
        
    }
}