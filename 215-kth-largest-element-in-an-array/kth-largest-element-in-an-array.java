class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));

        for(int num : nums){
            pq.add(num);
        }

        for(int i=1; i<= k-1; i++){
            pq.poll();
        }

        return pq.poll();
    }
}