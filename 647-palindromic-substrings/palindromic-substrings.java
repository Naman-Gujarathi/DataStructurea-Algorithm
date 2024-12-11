class Solution {

    
    public int countSubstrings(String s) {

        int totalPalindromicSubstring[] = {0};

        if(s.length() == 1) return 1;

        
        // int count = 0;
        // int count1 = 0;
        for(int i=0; i<s.length() -1; i++){
            
             isPalindrome(i , i , s,totalPalindromicSubstring );
             isPalindrome(i, i+1, s, totalPalindromicSubstring );
        }

        return totalPalindromicSubstring[0] + 1;
        
    }

    void isPalindrome(int left, int right, String s, int[] totalPalindromicSubstring ){
        while((left >= 0) && (right <= s.length()-1) && (s.charAt(left) == s.charAt(right)) ){
            totalPalindromicSubstring[0]++;

            left--;
            right++;
        }
        // return totalPalindromicSubstring++;
    }
}