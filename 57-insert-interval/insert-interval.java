class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

       
        if(intervals.length == 0){
           int resultArray1[][] = new int[1][2];
           resultArray1[0][0] = newInterval[0];
           resultArray1[0][1] =  newInterval[1];
           return resultArray1;

        }
        List<int[]> currentList = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            while( (i< intervals.length) && intervals[i][1] < newInterval[0]){
                    currentList.add(intervals[i]);
                    i++;
            }

         
          
             while((i< intervals.length) && intervals[i][0] <= newInterval[1]){
                    
                    newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                    newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
                    i++;
            }

            currentList.add(newInterval);

            while( (i< intervals.length)){
                    currentList.add(intervals[i]);
                    i++;
            }

        }
      
     
        int i=0;
         int resultArray[][] = new int[currentList.size()][2];
        for(int temp[]:currentList) {
            
            resultArray[i][0] = temp[0];
            resultArray[i][1] = temp[1]; 
            i++;
        }

        return resultArray;
    }
}