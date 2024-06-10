class Solution {
    public List<List<Integer>> permute(int[] nums) {
       boolean visitedArray[] = new boolean[nums.length];
       List<Integer> currentList = new ArrayList<>();
       List<List<Integer>> resultList = new ArrayList<>();
       findAllCombinations(0, nums, visitedArray, currentList, resultList);
       return resultList;
    }

     void findAllCombinations(int index, int nums[], boolean visitedArray[], List<Integer> currentList, List<List<Integer>> resultList) {

        if(index == nums.length){
            resultList.add(new ArrayList<>(currentList));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(visitedArray[i] == false){
                currentList.add(nums[i]);// add element in list
                visitedArray[i] = true; // marked visited element
                 findAllCombinations(index + 1, nums, visitedArray, currentList, resultList);
                currentList.remove(currentList.size()-1);
                visitedArray[i] = false;
            }
            
        }
    }
}