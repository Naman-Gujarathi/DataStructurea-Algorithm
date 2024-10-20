class Solution {
    public long maxKelements(int[] nums, int k) {
        
        PriorityQueue<Long> queue = new PriorityQueue<>((a,b) -> Long.compare(b,a));

        long result = 0;

        for(int i=0; i<nums.length; i++){
            
            queue.add((long)nums[i]);
        }
        long temp = 0;
        long poppedValue = 0;
       for(int i=1; i<=k; i++){
        // System.out.println("queue.poll" + queue.poll());
        poppedValue = (long) queue.poll();
        // System.out.println("poppedValue" + poppedValue);
        result = result + poppedValue;
        // System.out.println("result" + result);

        temp = (long)Math.ceil((double) poppedValue/3);

        // System.out.println(" temp " + temp);
        queue.add(temp);

        // System.out.println("queue current at " + i + "operation" + queue);
        //    result += queue.poll();
       
        //    temp = (int) Math.ceil(result/3);
        //    System.out.println("temp push in queue" + temp);
        //    queue.add(temp);
        //    temp = 0;
       }

       return result;
    }

}

   