class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] = new int[9]; 
        for(int i=0; i<=8; i++){
            arr[i] = i+1;
        }
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        int currentSum = 0;
        int index = 0;

        findAllCombination(index, k, n, arr, list, resultList, currentSum);
        return resultList;
    }

    void findAllCombination(int index, int k, int n , int arr[], List<Integer> list, List<List<Integer>> resultList, int currentSum ) {

        if(index >= arr.length){
            if(list.size() == k && currentSum == n){
                resultList.add(new ArrayList<>(list));
                
            }
            return;
        }

        
        list.add(arr[index]);
        findAllCombination(index + 1, k, n, arr, list, resultList, currentSum + arr[index]);
        list.remove(list.size()-1);
        findAllCombination(index + 1, k, n, arr, list, resultList, currentSum);


    }
}