class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        // 1,6. 2,8. 7,12 10,16
        
        int ref =points[0][1];// 6
        int minArrows =0;
        for(int i=0; i<points.length-1; i++){
            if(ref >= points[i+1][0]){
                continue;
            }
            else{
                minArrows++;
                ref = points[i+1][1];
            }
        }

        return minArrows + 1;

    }
}