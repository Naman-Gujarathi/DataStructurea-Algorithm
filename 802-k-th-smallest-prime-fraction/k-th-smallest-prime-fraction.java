class Pair {
    int a;
    int b;
    double value;

    Pair(int a,int b, double value){
        this.a = a;
        this.b = b;
        this.value = value;

    }

}

class Solution {
    
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        // HashMap<Pair, Integer> map = new HashMap<>();
        // (a,b)->(a-b)
        PriorityQueue<Pair> queue = new PriorityQueue<>((a,b)->(Double.compare(a.value,b.value)));

       
        
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                queue.add(new Pair(arr[i],arr[j],(double)arr[i]/(double)arr[j]));
            }
        }
        

        for(int i=0; i<k-1; i++){
           // System.out.println(queue.peek().a +" "+queue.peek().b +" "+queue.peek().value);
             queue.poll();
        }
        Pair obj = queue.poll();

        int ans[] = new int[2];
        ans[0] = obj.a;
        ans[1] = obj.b;

        return ans;
    }
}