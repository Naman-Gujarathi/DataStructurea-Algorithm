class Solution {

    
    public int countSubstrings(String s) {

        int totalPalindromicSubstring = 0;

        if(s.length() == 1) return 1;

        
        // int count = 0;
        // int count1 = 0;
        for(int i=0; i<s.length() -1; i++){
            
            totalPalindromicSubstring  = totalPalindromicSubstring  + isPalindrome(i , i , s, 0) + isPalindrome(i, i+1, s, 0 );
           
        //   System.out.pritnln("1st part " + isPalindrome(i , i , s, 0));
        //   System.out.pritnln("2nd part " + isPalindrome(i, i+1, s, totalPalindromicSubstring ));


        }

        return totalPalindromicSubstring + 1;
        
    }

    int isPalindrome(int left, int right, String s, int totalPalindromicSubstring ){
        while((left >= 0) && (right <= s.length()-1) && (s.charAt(left) == s.charAt(right)) ){
            totalPalindromicSubstring++;

            left--;
            right++;
        }
        return totalPalindromicSubstring++;
    }
}