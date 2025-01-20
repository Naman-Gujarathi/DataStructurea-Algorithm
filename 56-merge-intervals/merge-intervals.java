class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] -b[0]);
        if(intervals.length == 1){
            return intervals;
        }

        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> resultList = new ArrayList<>();
    
        for(int i=1; i<intervals.length; i++){
            if(end >= intervals[i][0]){
                if(intervals[i][1] > end){
                     end = intervals[i][1];
                }
               
            }else{
                // list.add(start); 
                // list[0]= start;
                // list.add(end);
                // list[1]= end;
                resultList.add(new int[]{start, end});
                // list.clear();
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // list[0]= start;
        // list[1]= end;
        resultList.add(new int[]{start, end});

        int resultArray[][] = new int[resultList.size()][2];
        int idx = 0;
        for( int[] list1:resultList){
             resultArray[idx][0] =list1[0];
             resultArray[idx][1] =list1[1];
             idx++;
        }
        return resultArray;
    }
}