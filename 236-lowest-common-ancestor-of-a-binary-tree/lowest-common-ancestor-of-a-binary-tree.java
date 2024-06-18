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
       for(int i=0; i<list1.size(); i++){
            System.out.println("List 1" );
             System.out.println(list1.get(i).val);
       }
        for(int i=0; i<list2.size(); i++){
             System.out.println("List 2" );
             System.out.print(list2.get(i).val);
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
// TC: O(3N)
// SC: O(4N)