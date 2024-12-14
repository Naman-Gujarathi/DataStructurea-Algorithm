class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    HashSet<Integer> set = new HashSet<>();
    set.add(arr[0]);
    int min = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length-1; i++){
             set.add(arr[i+1]);
             int currValue = arr[i+1] - arr[i];
             min = Math.min(min, currValue);
        }
        System.out.println("set" + set);

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            
                if(set.contains(arr[i] + min)){
                    list.add(arr[i]);
                    list.add(arr[i] + min);
                    resultList.add(new ArrayList<>(list));
                } 
            
            list.clear();
        }

        return resultList;
    }
    
}


