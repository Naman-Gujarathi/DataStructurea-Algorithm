// variable ones store value of that number whose count is only once
// variable twos store count of that number whose count is twice
// count more that two  variable ones and  variable twos store zero for them 


// first calcultate bitwise XOR operator variable ones with num and than compliment with variable ones current value; resultant is count of that number stored in ones if number num  count is  one it will store in that number if count of num more than one  it will store 0 in ones
// similarly count for two is considered 

class Solution {
    public int singleNumber(int[] nums) {
        int ones =0;
        int twos = 0;
        for(int num : nums){
            // first XOR with ones later AND with compliment of twos
            ones = (ones ^ num) & (~twos);
        
            // first XOR with twos and later AND with compliment of ones
            twos = (twos ^ num ) & (~ ones);
          
        }
        return ones;
    }
}