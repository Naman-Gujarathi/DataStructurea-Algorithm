// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
   
   
//      int arr[] = new int[2];
//       for(int p=0; p<nums.length; p++){
//                   map.put(nums[p], p);
//       }  
//       System.out.println(map);
    
//       for(int i=0; i<nums.length; i++){    
                        
//                 if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])){
//               arr[0]= i;
//               arr[1] = map.get(target-nums[i]);
                                  
//          }
//       }

     

//       return arr;
//     }
//     }



// second = target - first;


class Solution {

    public int[] twoSum(int[] nums, int target) {

        int arr[] = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])) {
                   arr[0]=i;
                   arr[1]=map.get(target-nums[i]);
                   break;
            }
        }

        return arr;

        


    }

 
}



          
























