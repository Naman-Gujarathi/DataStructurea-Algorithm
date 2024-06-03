class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length -1;
        int currentArea =0;
        int maxArea =0;

        while (left < right){
            currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(currentArea, maxArea);
            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}