class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         
        List<Integer> list = new ArrayList<>();
        int index =0;
        List<List<Integer>> resultList= new ArrayList<>();
        int currentSum =0;
        findAllCombinationSum(candidates, target, list, currentSum, index, resultList);
         return resultList;
         
    }

     void findAllCombinationSum(int[] candidates, int target, List<Integer> list, int currentSum,  int index, List<List<Integer>> resultList){

            if(index >= candidates.length){ // index equlas candidate length
                if(currentSum == target ){ // if currentSum == target it mean we got desired combination
                    // System.out.println("list " + list);
                    resultList.add(new ArrayList<>(list));
                }
                return;
            }
            if(currentSum + candidates[index] <= target){ // tom kae currentsum doesnt exceed target
                 list.add(candidates[index]);
                 // calling the function for same index
                 findAllCombinationSum(candidates, target, list, currentSum + candidates[index], index, resultList);
                 if(list.size() >0){
             list.remove(list.size()-1);
           }
            }
            // if currentSum is greater than target move to next index without adding it
            // findAllCombinationSum(candidates, target, list, currentSum, index, resultList);
           
            
            findAllCombinationSum(candidates, target, list, currentSum, index+1, resultList);
                       
         }
}