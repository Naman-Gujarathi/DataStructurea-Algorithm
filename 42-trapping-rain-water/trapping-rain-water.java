class Solution {
    public int trap(int[] height) {
        if(height.length == 1){
            return 0;
        }
        int totalWaterTrappedUnit = 0;
        int waterTrap[][] = new int[2][height.length];

        int maxLeft = 0;
        int maxRight = 0;

        for(int i=0; i<height.length; i++){
           maxLeft = Math.max(height[i], maxLeft);
           waterTrap[0][i] = maxLeft;

           maxRight = Math.max(height[height.length -1 - i], maxRight);
           waterTrap[1][height.length -1 - i] = maxRight;

        }

        for(int i=0; i<height.length; i++){
             
              int waterTrapped =  Math.min(waterTrap[0][i], waterTrap[1][i]) - height[i];
              totalWaterTrappedUnit = totalWaterTrappedUnit + waterTrapped;
        }

        return totalWaterTrappedUnit;

        
    }
}