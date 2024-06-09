class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // since candidate array has duplicate elemetn there going with second pattern for 
        //getting combination using array
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0, candidates, target, resultList, currentList);
        return resultList;
    }

    void findCombination(int index, int[] candidates, int target, List<List<Integer>> resultList, List<Integer> currentList) {

        if(target == 0){
            resultList.add(new ArrayList<>(currentList));
            return;
        }
        // for loop is running to select an element for index postoion if slected move to i+1
        for(int i=index; i<candidates.length; i++){
            if(i> index && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }

            currentList.add(candidates[i]);
            findCombination(i+1, candidates, target - candidates[i], resultList, currentList);
            currentList.remove(currentList.size()-1);
        }


    }
}
