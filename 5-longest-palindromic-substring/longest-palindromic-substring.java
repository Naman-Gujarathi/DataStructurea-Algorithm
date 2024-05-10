class Solution {
    public String longestPalindrome(String s) {
        
        // iterate string
        // chek its corresponding left and right
        // check condition for palindrome
        // update the length if palindrom return ture if not palindrome move to next character 
        // return longest palindromic substring
        if(s.length() == 1 ){
            return s;
        }
        int longestSubString[] = {0};
        int[] start = {0};
        int[] end ={0};
        for(int i=0; i<s.length()-1; i++){
            int left = i;
            int right = i;
            helperfunction(left, right, s, longestSubString, start, end);
            helperfunction(left, right+1, s, longestSubString, start, end);
 
        }

        
        // for(int i=0; i<s.length()-1; i++){
        //     int left = i;
        //     int right = i+1;
           
        //     while(left>=0 && right<=s.length()-1 && s.charAt(left) == s.charAt(right) ) {
        //             if(longestSubString < right - left +1){
        //                 longestSubString = right - left +1;
        //                 start = left;
        //                 end = right;
                       
        //             }

        //             left--;
        //             right++;
        //     }
            
        // }
        return s.substring(start[0], end[0]+1);
        
    }
    // boolean checkPalindrome(String string){
    //     int left =0;
    //     int right = string.length()-1;
    //     while(left<=right){
    //         if(string.charAt(left) != string.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }

    void helperfunction(int left, int right, String s, int longestSubString[], int start[], int end[]){
              while(left>=0 && right<=s.length()-1 && s.charAt(left) == s.charAt(right) ) {
                    if(longestSubString[0] < right - left +1){
                        longestSubString[0] = right - left +1;
                        start[0] = left;
                        end[0] = right;
                       
                    }

                    left--;
                    right++;
            }
        }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int maxLen =0;
        // int currentLen =0;
        // int start =0;
        // int end =0;
        // if(s.length() ==1){
        //     return s;
        // }
       
        // for(int i=0; i<s.length(); i++){
        //     currentLen =1;
        //     if(currentLen >maxLen){
        //         maxLen = currentLen;
        //         start = i;
        //         end = i+1;
        //     }
        //     // start = i;
        //     // end =i+1;
        //     int left =i-1;
        //     int right = i+1;
        //     while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
        //         currentLen = right - left +1;
        //         if(maxLen < currentLen){
        //             maxLen = currentLen;
        //             start = left;
        //             end = right +1;
                    
        //         }

        //         left--;
        //         right++;
        //     }

        // }
        
        // for(int i=1; i<s.length(); i++){
        //     if(s.charAt(i-1) == s.charAt(i)){
           
        //         currentLen =2;
               
        //         if(currentLen > maxLen){
        //             maxLen = currentLen;
        //             start = i-1;
        //             end = i+1;
        //         }
        //         // start = i-1;
        //         // end = i+1;
        //         int left = i-2;
        //         int right=i+1;
        //         while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
        //             currentLen = right - left +1;
        //             if(maxLen < currentLen){
        //             maxLen = currentLen;
        //             start = left;
        //             end = right +1;
                    
        //         }
        //             left--;
        //             right++;
        //         }
        //     }
        // }
        // return s.substring(start, end);  

//     }
// }