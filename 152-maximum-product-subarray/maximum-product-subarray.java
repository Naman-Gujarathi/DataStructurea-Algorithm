class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 1;
        int max2 = 1;
        int max1Value = Integer.MIN_VALUE;
        int max2Value = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max1 = nums[i] * max1;
            max1Value = Math.max(max1, max1Value);
            if(max1 == 0)  max1 =1;
            max2 = nums[nums.length - 1 - i] * max2;
            max2Value = Math.max(max2, max2Value);
            if(max2 == 0)  max2 =1;
        }

        return Math.max(max1Value, max2Value);
    }
}