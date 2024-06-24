class Solution {
    public int[][] merge(int[][] intervals) {
        // intervals[i][1] >= intervals[i+1][0];
        if(intervals.length == 1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        // int end = -1;
        for(int i=0; i<intervals.length-1; i++){
           
            while((i < intervals.length-1) &&  end >= intervals[i+1][0]){
                end = Math.max(end, intervals[i+1][1]); 
                 i++;
                 continue;
            }

            if((i < intervals.length-1) && end < intervals[i+1][0]) {
              
                list.add(start);
                list.add(end);
                resultList.add(list);
                list = new ArrayList<>();
                start = intervals[i+1][0];
                end = intervals[i+1][1];
            }


        }

           
            list.add(start);
            list.add(end);
            resultList.add(list);
         

            

        int result[][] = new int[resultList.size()][2];
        int row =0;
          
           for(List<Integer> currentList: resultList){
                result[row][0] = currentList.get(0);
                result[row][1] = currentList.get(1);
                row++;
           }

            return result;
    }
}