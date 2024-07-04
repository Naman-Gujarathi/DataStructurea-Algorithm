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
        int level =-1;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            level++;
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
            // System.out.println("cl" + currentList);
            if(level %2 != 0){
                Collections.reverse(currentList);
                list.add(new ArrayList<>(currentList));
            }else{
                list.add(new ArrayList<>(currentList));
            }
           
            currentList = new ArrayList<>();
         
        }

        return list;
    }
}