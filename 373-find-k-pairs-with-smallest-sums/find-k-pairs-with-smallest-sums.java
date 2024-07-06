class Pair{
    int x;
    int y;
    int sum;
    public Pair(int x, int y, int sum){
        this.x = x;
        this.y = y;
        this.sum = sum;
    }
}

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
      PriorityQueue<Pair> pq = new PriorityQueue<>(
        (a,b) -> a.sum - b.sum
      );

      List<List<Integer>> resultList = new ArrayList<>();

      List<Integer> currentList = new ArrayList<>();
      
      for(int i=0; i<nums1.length; i++){
        pq.add(new Pair(i, 0, nums1[i] + nums2[0]));
      }

        int currX = -1;
        int currY = -1;
        int currSum = -1;

      while(resultList.size() != k) {
        Pair obj = pq.poll();
        currX = obj.x;
        currY = obj.y;
        currentList.add(nums1[currX]);
        currentList.add(nums2[currY]);
        resultList.add(new ArrayList<>(currentList));
        currentList = new ArrayList<>();
        if(currY + 1 < nums2.length){
            pq.add(new Pair(currX, currY + 1, nums1[currX] + nums2[currY + 1]));
        }
      }
        return resultList;
    }
}



