class Solution {
    public long minimumSteps(String s) {

        char arr[] = s.toCharArray();
        long counter = 0;
        long minSwap = 0;

        for(int i = arr.length - 1; i>=0; i--){
            if(arr[i] == '0'){
                counter++;  
            } else{
                minSwap = minSwap + counter;
            }
        }
        
        
        return minSwap;
    }  
}




 
