class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<Integer> currentList = new ArrayList<>();// currentList
      List<List<Integer>> resultList = new ArrayList<>(); // resultList
      int index =0; // index is zero initially
      for(int num : nums){
         currentList.add(num);
      }
      findCombination(index, currentList, resultList);
      return resultList;
    }

   void findCombination(int index,  List<Integer> currentList, List<List<Integer>> resultList){

        if(index == currentList.size()){
            resultList.add(new ArrayList<>(currentList));
            return;
        }

        for(int i= index; i<currentList.size(); i++){
            swap(index, i, currentList);
            findCombination(index + 1, currentList, resultList);
            swap(index, i, currentList);
        }
    }

    void swap(int index, int i, List<Integer> currentList){
         int temp = currentList.get(index);
         currentList.set(index, currentList.get(i));
         currentList.set(i, temp);
    }
}