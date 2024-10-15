class Solution {
    public long minimumSteps(String s) {

        long countZero[] = new long[s.length()];
        char arr[] = s.toCharArray();
        long counter = 0;

        for(int i = arr.length - 1; i>=0; i--){
            if(arr[i] == '0'){
                counter++;
                countZero[i] = counter;    
            } else{
                countZero[i] = counter; 
            }
        }
        long minSwap = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '1' ){
                minSwap = minSwap + countZero[i];
            }
        }
        return minSwap;
        // char arr[] = s.toCharArray();
        // int left = 0;
        // int right = arr.length -1;
        // long counter = 0;
        // while(left < right){
        //    int value = (arr[left] - '0') - (arr[right] - '0');
        //         if(value == 0){
        //             if(arr[left]  == '0'){
        //                 left++;
        //             }
        //             else{
        //                 right--;
        //             }
        //         }
        //         else if(value > 0){
        //             swap(left, right, arr);
        //             counter++;
        //             left++;
        //             right--;
        //         }
        //         else{
        //             left++;
        //             right--;
        //         }
        //     }
        //     return counter;
    }

    // public void swap(int left, int right, char[] arr){
    //     char temp = arr[left];
    //     arr[right] = arr[left];
    //     arr[left]  = temp;
    // }   
}


// 1 0 1 1 0 0 1

 
