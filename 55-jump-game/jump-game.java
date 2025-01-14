class Solution {
    public boolean canJump(int[] nums) {
        int maxValue = 0;

        for(int i=0; i<nums.length; i++){

            if(i > maxValue){
                return false;
            }

            maxValue = Math.max(maxValue, i + nums[i]);

            if(maxValue >= nums.length-1){
                return true;
            }
        }

        return false;

    }
}