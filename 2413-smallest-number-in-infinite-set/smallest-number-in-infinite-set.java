class SmallestInfiniteSet {
    HashSet<Integer> set;
    PriorityQueue<Integer> queue;
    public SmallestInfiniteSet() {
        set = new HashSet<>();
        queue = new PriorityQueue<>((a,b)-> a-b);

        for(int i=1; i<=1000; i++){
            set.add(i);
            queue.add(i);
        }
    }
    
    public int popSmallest() {
        int val = queue.poll();
        set.remove(val);
        return val;
    }
    
    public void addBack(int num) {
        if(!set.contains(num)) {
              set.add(num);
              queue.add(num);
        }
      

    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */