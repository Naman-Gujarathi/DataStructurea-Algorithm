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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
       
        int level = 0;
        while(!queue.isEmpty()){
            List<Integer> currLevel = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++){
                
                TreeNode poppedNode = queue.poll();
                currLevel.add(poppedNode.val);
                
                if(poppedNode.left != null){
                    queue.add(poppedNode.left);
                }

                if(poppedNode.right != null){
                    queue.add(poppedNode.right);
                }

            }

            if(level % 2 != 0){
                Collections.reverse(currLevel);
            }
            resultList.add(new ArrayList<>(currLevel));
            level++;        
        }

        return resultList;
    }
}