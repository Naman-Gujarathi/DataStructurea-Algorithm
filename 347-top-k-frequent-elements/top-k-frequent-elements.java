// class CustomNode {
//     int key;
//     int value;
//     public CustomNode(int key, int value){
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // System.out.println("Map" + map);
        // return new int[0];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        for(int i=0; i<=k-1; i++){
            arr[i] = pq.poll().getKey();

        }

        return arr;

        
    }
}