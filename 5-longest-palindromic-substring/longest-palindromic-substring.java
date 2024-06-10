class Triplet {
    int start;
    int end;
    int max;
    public Triplet(){
        this.start = 0;
        this.end = 0;
        this.max = 0;
    }
}

class Solution {
    public String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        Triplet obj = new Triplet();
          for(int i=0; i<s.length(); i++){
            int left =i;
            int right =i;
            checkPalindrome(left, right,  sb, s, obj);
            checkPalindrome(left, right+1, sb, s, obj);
            
        }
        return s.substring(obj.start, obj.end + 1);
    }

    void checkPalindrome(int left, int right,  StringBuffer sb, String s, Triplet obj) {
       
             while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(obj.max < (right - left + 1)){
                    obj.max = right - left + 1;
                    obj.start = left;
                    obj.end = right;
                }
                left--;
                right++; 
            }
         
    }
}