class Solution {
    public int similarPairs(String[] words) {

        Set<Character> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder(); 

        int totalCountPairs = 0;

            for(String word : words){
                char arr[] = word.toCharArray();
                for(Character c: arr){
                    set.add(c);
                }

               String sortedNewString = sortedString(set,list, sb);

                if(map.containsKey(sortedNewString)){
                     totalCountPairs += map.get(sortedNewString);
                }
               


                map.put(sortedNewString, map.getOrDefault(sortedNewString, 0) + 1);
                
            }

            return totalCountPairs;
       
         }

    

    String sortedString(Set<Character> set,  List<Character> list, StringBuilder sb  ){
       
        list.clear();
        sb.setLength(0);
        for(char ch : set){
            list.add(ch);
        }

        Collections.sort(list);
      
        for(char ch : list){
            sb.append(ch);
        }

        set.clear();

        return sb.toString();
    }
}