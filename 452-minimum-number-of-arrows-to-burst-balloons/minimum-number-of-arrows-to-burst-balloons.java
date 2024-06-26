class Solution {
    public int findMinArrowShots(int[][] points) {
        // pepcoding
        // Goal is to sort 2D array on first coloum ref and check with its next rows 0th row 
        // and check if next row oth coloum value is less than equal to ref it mean it will 
        // be burst using same arrow
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