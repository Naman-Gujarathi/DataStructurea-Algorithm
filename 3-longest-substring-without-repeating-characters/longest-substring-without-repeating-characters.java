class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            int j = i;
            while((j< s.length()) && (!set.contains(s.charAt(j)))){
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, set.size());
                j++;
            }
            set.clear();
        }

        return maxLen;
    }
}