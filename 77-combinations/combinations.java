class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> currentList = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>();

        // List<List<Integer>> resultList = new ArrayList<>();
        // List<Integer> currentList = new ArrayList<>();
        int arr[] = new int[n];
        for(int i=1; i<=n; i++){
            arr[i-1] = i;
        }
        int index =0;
        findCombinations(n, index, k, arr,  currentList, resultSet);

        return new ArrayList<>(resultSet);

    }

    void findCombinations(int n, int index, int k, int arr[], List<Integer> currentList,Set<List<Integer>> resultSet){

       
        if( currentList.size() == k ){
                resultSet.add(new ArrayList<>(currentList));
                 return;
            }

            if( currentList.size() > k || index >= arr.length){
                
                 return;
            }
           
        currentList.add(arr[index]);
        findCombinations(n, index +1, k, arr,  currentList, resultSet);
        currentList.remove(currentList.size()-1);
        findCombinations(n, index + 1, k, arr,  currentList, resultSet);

    }
}


