class Triplet{
    int max;
    int left;
    int right;

    public Triplet(int max, int left, int right){
        this.max = max;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public String longestPalindrome(String s) {
        
        if(s == null || s.length() == 0 || s.length() == 1) return s;

        Triplet triplet = new Triplet(0, 0 , 0);

        for(int i=0; i<s.length()-1; i++){
            
            findLongestPalindrome(i, i, s, triplet);

            findLongestPalindrome(i, i+1, s, triplet);
        }

        return s.substring(triplet.left, triplet.right + 1);
    }

    void findLongestPalindrome(int left, int right, String s, Triplet triplet){
       int max = 0;
       while( ((left ) >= 0) && ((right) <= (s.length() -1)) && (left <= right)  && (s.charAt(left) == s.charAt(right))){
            
                max = right - left + 1;
                if(max > triplet.max){
                    triplet.left = left;
                    triplet.right = right;
                    triplet.max = max;
                }

                left--;
                right++;


            }
       }


    }




