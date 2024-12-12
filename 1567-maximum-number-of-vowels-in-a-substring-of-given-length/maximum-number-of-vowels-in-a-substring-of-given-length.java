class Solution {
    public int maxVowels(String s, int k) {
        if(s.length() == 1) {
            if(isVowel(s.charAt(0))){
                return 1;
            }
            return 0;
        }
        int countVowel = 0;
        int maxCountVowel = 0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                countVowel++;
            }
        }
        maxCountVowel = Math.max(maxCountVowel,countVowel);
        if(k == s.length()){
            return maxCountVowel;
        }

        else if( k < s.length()){
            for(int j=1; j<s.length() - k + 1; j++){

                if(isVowel(s.charAt(j-1))){
                   countVowel--; 
                }

                if(isVowel(s.charAt(j + k -1))){
                    countVowel++;
                }
                maxCountVowel = Math.max(maxCountVowel,countVowel);
            }
        }

        return maxCountVowel;

    }

    boolean isVowel(Character ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            return true;
        }
        return false;
    }
}