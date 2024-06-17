/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class Pair {
    long currPrefixSum;
    int count;
    public Pair(long currPrefixSum, int count){
        this.currPrefixSum = currPrefixSum;
        this.count = count;
    }
 }
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        Pair pair = new Pair(0,0);
        map.put(pair.currPrefixSum,1);
        dfs( root, targetSum, map, pair);
        return pair.count;
        
    }

    void dfs( TreeNode node, int targetSum, HashMap<Long, Integer> map, Pair pair){
        if(node == null){
            return;
        }
        pair.currPrefixSum = pair.currPrefixSum + (long)node.val;
        if(map.containsKey(pair.currPrefixSum - targetSum)){
            pair.count = pair.count + map.get(pair.currPrefixSum - targetSum);
        }
        map.put(pair.currPrefixSum, map.getOrDefault(pair.currPrefixSum, 0) + 1);
        dfs( node.left, targetSum, map, pair);
        dfs( node.right, targetSum, map, pair);
        map.put(pair.currPrefixSum, map.get(pair.currPrefixSum)-1);
        if(map.get(pair.currPrefixSum) == 0){
            map.remove(pair.currPrefixSum);
        }
        pair.currPrefixSum = pair.currPrefixSum - (long)node.val;    
    }
}

// 0, 1
// 10000000, 1
// 20000000, 1
// 49000000, 1
// 5000000, 1


