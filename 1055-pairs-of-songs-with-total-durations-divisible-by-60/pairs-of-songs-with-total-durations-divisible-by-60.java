class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        int arr[] = new int[60];
        int pairCount = 0;

        for(int t : time){
            int rem = t%60;
            int complement = 60 - rem;
            if(complement == 60){
                complement = 0;
            }
            pairCount += arr[complement];
            arr[rem]++; 

        }
        return pairCount;
    }
}

        // 60
        // rem = 0;
        // complent = 60

        // [0]. =1

        // 0
        // rem = 0
        // complent = 60

        //   15 [0]
        //   3..  [1]
        //  31  [2]
        //  33..   [3]
        //  37.  [4]
        //  29.  [5]
        //  43.  [6]
        //  19...  [7]

    //    Map<Integer, List<Integer>> map = new HashMap<>();
    //    int pairCount = 0;

    //    for(int i=0; i<time.length; i++){
    //        int rem =  time[i] % 60; 
    //         if(!map.containsKey(rem)){
    //             map.put(rem, new ArrayList<Integer>());
    //         }
    //         map.get(rem).add(i);
    //    }
    // System.out.println("map" + map);
    //    for(int i=0; i<time.length; i++){
    //         int complement = 60 - (time[i] % 60);
    //         if(complement == 60){
    //             complement = 0;
    //         }
    //         if(map.containsKey(complement) ){
    //            for( int value :map.get(complement)) {
    //                 if(i < value){
    //                     pairCount++;
    //                 }
    //            }
    //         }
    //    }

    //    return pairCount;
    
