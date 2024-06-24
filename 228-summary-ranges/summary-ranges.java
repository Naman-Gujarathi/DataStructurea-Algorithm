class Solution {
    public List<String> summaryRanges(int[] nums) {
      // iterate throughout the array
      // check if i have consecutive elements if not start new list
      // append to List
        List<String> resultList = new ArrayList<>();
        if (nums.length == 0 ) {
            return resultList; // If the input array is empty, return an empty list
        }
         StringBuilder sb = new StringBuilder();
           if (nums.length == 1 ) {
            sb.append(nums[0]);
            resultList.add(sb.toString());
            return resultList; // If the input array is empty, return an empty list
        }
       
        for(int i=0; i<nums.length-1; i++){
            
            if(nums[i] + 1== nums[i+1] ){
                sb.append(nums[i]);// 0
            }
                
             
             while((i <= nums.length -2) && nums[i] + 1 == nums[i+1]){// 
                i++;
                continue;
            }
            
            if((i <= nums.length -2) && nums[i] + 1 != nums[i+1] )  {
                if(sb.length() != 0){
                    sb.append("->");
                    sb.append(nums[i]);
                   
                } else{
                    sb.append(nums[i]);
                }
               
                resultList.add(sb.toString());
                sb = new StringBuilder();
             
            }
            
        }  

        if(nums[nums.length-2] + 1 == nums[nums.length-1]){
            sb.append("->");
            sb.append(nums[nums.length-1]);
            resultList.add(sb.toString());
        }
        else{   
                sb.append(nums[nums.length-1]);
                resultList.add(sb.toString());
            }
        
        return resultList;
    }
}