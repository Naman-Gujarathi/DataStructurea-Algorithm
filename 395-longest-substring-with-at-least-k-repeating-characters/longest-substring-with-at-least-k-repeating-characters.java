class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() < k){
            return 0;
        }
        if(k<=1){
            return s.length();
        }
         HashMap<Character, Integer> map = new HashMap<>();
        
         
         for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
         }
        int idx =0;
        int currLength = 0;
        
        while(idx < s.length() && map.get(s.charAt(idx)) >= k){
            currLength++;
            idx++;
        }

        if(currLength >= s.length()-1){
            return currLength;
        } 

       
        int max1 = longestSubstring(s.substring(0, idx), k) ;
    

        while(idx < s.length() && map.get(s.charAt(idx)) < k){
            idx++;
        }
        int max2 =0;
        if(idx < s.length()-1 ){
            max2 = longestSubstring(s.substring(idx, s.length()), k);
        }else{
            max2 =0;
        }

        return Math.max(max1, max2);

    }
}