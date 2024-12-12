/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      return findLCA(root, p, q);
    }

    TreeNode findLCA(TreeNode node, TreeNode p, TreeNode q){
        if(node == null){
            return null;
        }

        if(node.val == p.val){
            return p;
        }

        if(node.val == q.val){
            return q;
        }

        TreeNode val1 = findLCA(node.left, p, q);
        TreeNode val2 = findLCA(node.right, p, q);

        if(val1 != null && val2 != null ){
            return node;
        }

        else if(val1 == null && val2 == null ){
            return null;
        }

        else if(val1 != null && val2 == null ){
            return val1;
        }

        else {
            return val2;
        }
    }

}