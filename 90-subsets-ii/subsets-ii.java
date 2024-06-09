class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array to handle duplicates
        findUniqueSubset(0, nums, new ArrayList<>(), resultList);
        return resultList;
    }

    void findUniqueSubset(int index, int[] nums, List<Integer> list, List<List<Integer>> resultList) {
        resultList.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue; // Skip duplicates
            list.add(nums[i]);
            findUniqueSubset(i + 1, nums, list, resultList);
            list.remove(list.size() - 1);
        }
    }
}
