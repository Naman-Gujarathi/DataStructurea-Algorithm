class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                sum = sum -1;
                // map.put(i, sum);
            } else{
                sum = sum + 1;
                // map.put(i, sum);
            }
            if(map.containsKey(sum)){
                int start = map.get(sum);
                if(i-start > maxLen){
                    maxLen = i -start;
                }
            }else{
                map.put(sum, i);
            }
            
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }

}