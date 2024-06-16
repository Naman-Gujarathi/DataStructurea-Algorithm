class Solution {
    public int subarraySum(int[] nums, int k) {
         int currentPrefix =0; // currentPrefix sum 
         int resultCount =0; // total resultCount
         HashMap<Integer, Integer> map = new HashMap<>();
         map.put(0, 1);
         
         for(int i=0; i<nums.length; i++){
            currentPrefix = currentPrefix + nums[i];
            if(map.containsKey(currentPrefix - k)){
                resultCount = resultCount + map.get(currentPrefix - k);  
            }
            map.put(currentPrefix, map.getOrDefault(currentPrefix, 0) + 1);
         
                   
         }

         return resultCount;
    }
}