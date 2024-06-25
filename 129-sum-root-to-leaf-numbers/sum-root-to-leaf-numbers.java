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
class Solution {
    public int sumNumbers(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        int sum[] = {0};
        dfs(root, sb, sum);
        return sum[0];
    }

    void dfs(TreeNode node, StringBuffer sb, int sum[]   ){
        if(node == null){
            return;
        }

        sb.append(node.val);

        dfs(node.left, sb, sum);

        dfs(node.right, sb, sum);

        if(node.left == null && node.right == null){
            sum[0] = sum[0] + Integer.parseInt(sb.toString()); 
        }

        if(sb.length() > 0){
            sb.setLength(sb.length() -1);
        }


        
    }
}