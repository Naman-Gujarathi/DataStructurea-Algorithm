class Solution {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length -1;
        int currentIndex = 0;
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return jumpGame(nums, lastIndex, currentIndex, dp);

    }

    boolean jumpGame(int[] nums, int lastIndex, int currentIndex, int dp[]){
        if( currentIndex == lastIndex){
            return true;
        }

         if(nums[currentIndex] == 0 || currentIndex > lastIndex){
            return false;
        }

        if( dp[currentIndex] != 0){
            for(int i=1; i<=nums[currentIndex]; i++){
                if(jumpGame(nums, lastIndex, currentIndex + i, dp)){
                    return true;
                }
            }
        }
       

        dp[currentIndex] = 0;

        return false;
    }
}