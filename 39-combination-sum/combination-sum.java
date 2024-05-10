class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int index =0;
        
        List<Integer> currentList = new ArrayList<Integer>();
        List<List<Integer>> resultList = new ArrayList<>();
        findCombinationSum(index, candidates, target, currentList, resultList);
        return resultList;   
    }

    void findCombinationSum(int index, int[] candidates, int target, List<Integer> currentList, List<List<Integer>> resultList) {

        
         if(index == candidates.length) {
            //  System.out.println("CL " + currentList);
             if(target== 0) {
                 resultList.add(new ArrayList<>(currentList));
             }
             return;
         }
         
         if(target >= candidates[index]) {
               currentList.add(candidates[index]);
               findCombinationSum(index, candidates, target - candidates[index], currentList, resultList);
               currentList.remove(currentList.size()-1);// jo add krunga vo hi remove hoga isliye add and remove written in same if block
         }
        
        
         findCombinationSum(index + 1, candidates, target, currentList, resultList );

     }
}
// Lessons Learnt

// follow pattern add remove vaala
// to pick same element again and againbe on same index
// condition when picking same element has to be stopped
// target mai se minus krna hai and check if taarget == 0
// Keeping add and remove in same if condition element which is addedd will only be removed

