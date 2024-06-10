class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> resultList = new HashSet<>();
        int index = 0;
        findUniqueSubset(index, nums, list, resultList);
        return new ArrayList<>(resultList);
    }

    void findUniqueSubset(int index, int[] nums, List<Integer> list, Set<List<Integer>> resultList) {
        if (index == nums.length) {
            List<Integer> sortedList = new ArrayList<>(list);
            Collections.sort(sortedList);
            resultList.add(sortedList);
            return;
        }

        list.add(nums[index]);
        findUniqueSubset(index + 1, nums, list, resultList);
        list.remove(list.size() - 1);
        findUniqueSubset(index + 1, nums, list, resultList);
    }
}