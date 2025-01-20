class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] -b[0]);
        if(intervals.length == 1){
            return intervals;
        }

        int start = intervals[0][0];
        int end = intervals[0][1];
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<intervals.length; i++){
            if(end >= intervals[i][0]){
                if(intervals[i][1] > end){
                     end = intervals[i][1];
                }
               
            }else{
                list.add(start);
                list.add(end);
                resultList.add(new ArrayList<>(list));
                list.clear();
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        list.add(start);
        list.add(end);
        resultList.add(new ArrayList<>(list));

        int resultArray[][] = new int[resultList.size()][2];
        int idx = 0;
        for( List<Integer> list1:resultList){
             resultArray[idx][0] =list1.get(0);
             resultArray[idx][1] =list1.get(1);
             idx++;
        }
        return resultArray;
    }
}