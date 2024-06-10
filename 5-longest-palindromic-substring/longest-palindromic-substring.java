class Solution {
    public String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        int start[] = {0};
        int end[] = {0};
        int max[] ={0};
          for(int i=0; i<s.length(); i++){
            int left =i;
            int right =i;
            checkPalindrome(left, right, start, end, sb, s, max);
            checkPalindrome(left, right+1, start, end, sb, s, max);
            
        }
        return s.substring(start[0], end[0] + 1);
    }

    void checkPalindrome(int left, int right, int start[], int end[], StringBuffer sb, String s, int max[]){
       
             while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(max[0] < (right - left + 1)){
                    max[0] = right - left + 1;
                    start[0] = left;
                    end[0] = right;
                }
                left--;
                right++; 
            }
         
    }
}