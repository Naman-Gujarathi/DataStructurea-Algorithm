class Solution {
    public boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length()){
            return false;
        }
        
        int freqWord1[] = new int[26];
        int freqWord2[] = new int[26];

        for(int i=0; i<word1.length(); i++){
            freqWord1[word1.charAt(i) - 'a']++;
            freqWord2[word2.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; i++){
            if((freqWord1[i] == 0  && freqWord2[i] !=0) || (freqWord1[i] != 0  && freqWord2[i] == 0) ){
                return false;
            }
        }

        Arrays.sort(freqWord1);
        Arrays.sort(freqWord2);

        return Arrays.equals(freqWord1, freqWord2);


    }
}