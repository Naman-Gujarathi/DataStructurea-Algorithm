class Solution {
    public int[] singleNumber(int[] nums) {
        int result =0;
        
        int resultArray[] = new int[2];
        resultArray[0] =0;
        resultArray[1]=0;

        for(int num : nums){
            result = result ^ num;
        }

        int bit = 1;

        while((bit & result) == 0 ) {
            bit = bit << 1;
        }
        
    // Divide in two groups
        for(int num : nums){

            if((bit & num) != 0){
                resultArray[0] = resultArray[0] ^ num;
            } else {
                resultArray[1] = resultArray[1] ^ num;
            }
        }
        
        return resultArray;


    }
}