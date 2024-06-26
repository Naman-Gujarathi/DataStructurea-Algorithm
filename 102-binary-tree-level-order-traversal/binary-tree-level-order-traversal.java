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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null ){
            return resultList;
        }
        
        List<Integer> currentList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode poppedNode = queue.poll();
                currentList.add(poppedNode.val);
                if(poppedNode.left != null){
                    queue.add(poppedNode.left);
                }
                if(poppedNode.right != null){
                    queue.add(poppedNode.right);
                }
            }
            resultList.add(new ArrayList<>(currentList));
            currentList = new ArrayList<>();
        }

        return resultList;
        
    }
}