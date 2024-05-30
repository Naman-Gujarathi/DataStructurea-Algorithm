class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // iterate the stirng
        // sort it and check
        // append into list
        //return values;

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> resultList = new ArrayList<>();

        for(String str : strs){
            char new_str[] = str.toCharArray();
            Arrays.sort(new_str);
            String sortedString = new String(new_str);
            if(!map.containsKey(sortedString )){
                map.put(sortedString , new ArrayList<>());
            }
            map.get(sortedString).add(str);
 
        }
        for(List<String> currentList : map.values()){
            resultList.add(currentList);
        }
       
       return resultList;
        
    }
}