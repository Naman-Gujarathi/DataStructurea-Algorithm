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
 class Pair{
    int currentValue;
    int maxValue;
    int minLevel;
    public Pair(int currentValue, int maxValue, int minLevel){
        this.currentValue = currentValue;
        this.maxValue = maxValue;
        this.minLevel = minLevel;
    }
 }
class Solution {
    public int maxLevelSum(TreeNode root) {
        Pair pair = new Pair(0, Integer.MIN_VALUE, 0);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int currentLevel = 1;
        bfs( currentLevel, root, pair, queue);
        return pair.minLevel;
    }
    void bfs(int currentLevel, TreeNode node, Pair pair, Queue<TreeNode> queue){
        while(!queue.isEmpty()) {
            int size = queue.size();
            pair.currentValue = 0;
            for(int i=0; i<size; i++){
                TreeNode poppedNode = queue.poll();
                pair.currentValue = pair.currentValue + poppedNode.val;
                if(poppedNode.left != null){
                    queue.add(poppedNode.left);
                   
                }
                if(poppedNode.right != null){
                    queue.add(poppedNode.right);
                   
                }
                
            }
            if(pair.maxValue < pair.currentValue ){
                pair.maxValue = pair.currentValue;
                pair.minLevel = currentLevel;
            }
                currentLevel++;  
        }
    }
        
}