class Solution {
    public int similarPairs(String[] words) {

        Set<Character> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        int totalCountPairs = 0;

            for(String word : words){
                char arr[] = word.toCharArray();
                for(Character c: arr){
                    set.add(c);
                }

               String sortedNewString = sortedString(set);
            
                totalCountPairs += map.getOrDefault(sortedNewString, 0);


                map.put(sortedNewString, map.getOrDefault(sortedNewString, 0) + 1);
                
            }

            return totalCountPairs;
       
         }

    

    String sortedString(Set<Character> set){
        List<Character> list = new ArrayList<>(set);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder(); 
        for(char ch : list){
            sb.append(ch);
        }

        set.clear();

        return sb.toString();
    }
}