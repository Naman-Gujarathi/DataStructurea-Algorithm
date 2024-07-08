class Solution {
    public boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> word1Info = new HashMap<>();
        HashMap<Character, Integer> word2Info= new HashMap<>();

        for(int i=0; i<word1.length(); i++){
            word1Info.put(word1.charAt(i), word1Info.getOrDefault(word1.charAt(i), 0) + 1);
            word2Info.put(word2.charAt(i), word2Info.getOrDefault(word2.charAt(i), 0) + 1);
        }

        for(Character ch : word1Info.keySet()) {
            if(!word2Info.containsKey(ch)){
                return false;
            }
        }

        List<Integer> word1List = new ArrayList<>(word1Info.values());
        List<Integer> word2List = new ArrayList<>(word2Info.values());

       Collections.sort(word1List);

       Collections.sort( word2List);

        return word1List.equals( word2List);

    }
}