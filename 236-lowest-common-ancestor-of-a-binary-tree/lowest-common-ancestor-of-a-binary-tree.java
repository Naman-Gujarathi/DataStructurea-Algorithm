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
        ArrayList<TreeNode> list1 = new ArrayList<>();
        ArrayList<TreeNode> list2 = new ArrayList<>();
        TreeNode lca_Value = null;
         findLowestCommon(root, p,  list1);
         findLowestCommon(root, q, list2);  

         int n = Math.min(list1.size(), list2.size());
        for(int i=0; i<n; i++){
            if(list1.get(i).val == list2.get(i).val){
                lca_Value = list1.get(i);
                continue;
            } else{
               
                break;
            }
       }
         
       return lca_Value;
    }

    boolean findLowestCommon(TreeNode node, TreeNode target, ArrayList<TreeNode> list) {
        if(node == null){
            return false;
        }

        list.add(node);
        if(node.val == target.val){
            return true;
        }
        if(findLowestCommon(node.left, target, list)){
            return true;
        }
        if(findLowestCommon(node.right, target, list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
}
// TC: O(3N) O(2N) for recursion call for both target p and target q as well for loop between list1 and list 2
// SC: O(4N) for O(2N) call stack and O(2N) for list1 and list2