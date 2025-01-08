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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>(); // check it again
            // return null;
        }
           List<Integer> rightViewList = new ArrayList<Integer>();

        // if(root.left == null && root.right == null){
        //     rightViewList.add(root.val);
        //     return rightViewList; // check it again
        //     // return null;
        // }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        // rightViewList.add(root.val);
        int level = 0;


        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode rightMostNode = null;

            for(int i=0; i<size; i++){

                TreeNode poppedNode = queue.poll();
                rightMostNode = poppedNode;
                if(poppedNode.left != null){
                    queue.add(poppedNode.left);
                }
                if(poppedNode.right != null){
                    queue.add(poppedNode.right);
                }
            }
           rightViewList.add(rightMostNode.val);
        }

        return rightViewList;
    }
}