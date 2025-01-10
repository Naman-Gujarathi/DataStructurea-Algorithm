class Pair{
    String key;
    int frequency;
    public Pair(String key, int frequency){
        this.key = key;
        this.frequency = frequency;
    }

}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> map = new HashMap<>();
        List<String> resultList = new ArrayList<>();
        PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> {
            if(a.frequency != b.frequency){
             return b.frequency - a.frequency;
            }else{
               return a.key.compareTo(b.key); // lexicographical order
            }
        });

        if(words.length == 1){
            resultList.add(words[0]);
            return resultList;
        }

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            queue.add(new Pair(entry.getKey(), entry.getValue()));
        }

        for(int i=0; i<k; i++){
            Pair poppedPair = queue.poll();
            resultList.add(poppedPair.key);
        }

        return resultList;


    }
}