class Solution {
    public long maxKelements(int[] nums, int k) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b - a);

        long result = 0;

        for(int i=0; i<nums.length; i++){
            
            queue.add(nums[i]);
        }
        double temp = 0;
        int  poppedValue = 0;
       for(int i=1; i<=k; i++){
        // System.out.println("queue.poll" + queue.poll());
        poppedValue =  queue.poll();
        // System.out.println("poppedValue" + poppedValue);
        result = result + poppedValue;
        // System.out.println("result" + result);

        temp = Math.ceil((double) poppedValue/3);

        // System.out.println(" temp " + temp);
        queue.add((int) temp);

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

   