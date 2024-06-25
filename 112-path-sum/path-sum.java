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
 class Sum {
    int value;
    public Sum(int value){
        this.value = value;
    }
 }
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

       Sum sum = new Sum(0);
       return dfs(root, targetSum, sum); 
        
    }

    boolean dfs(TreeNode node, int targetSum, Sum sum){
        if(node == null){
            return false;
        }

        sum.value = sum.value + node.val;

        if(dfs(node.left, targetSum, sum)){
            return true;
        } 
        
        if(dfs(node.right, targetSum, sum)){
            return true;
        } 

        if(node.left == null && node.right == null){
            if(sum.value == targetSum){
                return true;
            }
        }

        sum.value = sum.value - node.val;

        return false;

    }
}