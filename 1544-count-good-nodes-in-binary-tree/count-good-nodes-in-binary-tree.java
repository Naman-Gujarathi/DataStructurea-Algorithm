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
    int goodNodesCount =0;
    int ref;
    public Pair(int goodNodesCount, int ref){
        this.goodNodesCount = goodNodesCount;
        this.ref = ref;
    }
 }
class Solution {
    public int goodNodes(TreeNode root) {
        Pair obj = new Pair(0, root.val); // obejct of Pair
        dfs(root, obj); // calling dfs function
        return obj.goodNodesCount;  // return total count
    }

    void dfs(TreeNode currNode, Pair obj){
        if(currNode == null){
            return;
        }
        int backtrackValue = obj.ref;
        if(currNode.val >= obj.ref){
            obj.goodNodesCount++;
            obj.ref = currNode.val;
        }
        dfs(currNode.left, obj);
        // obj.ref = backtrackValue;
        dfs(currNode.right, obj);
        obj.ref = backtrackValue;
    }
}