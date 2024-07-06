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

class MinDiff {
    int value;
    TreeNode previousNode;
    public MinDiff(int value, TreeNode previousNode ){
        this.value = value;
        this.previousNode = previousNode;
    }
 }

class Solution {
    public int getMinimumDifference(TreeNode root) {
        MinDiff obj = new MinDiff(Integer.MAX_VALUE, null); 
        useInorderDFS(root, obj);
        return obj.value;
       
    }

    void useInorderDFS(TreeNode root, MinDiff obj){
      
        if(root == null){
            return;
        }
 
        useInorderDFS(root.left, obj);
        if(obj.previousNode != null){
            if(Math.abs(root.val - obj.previousNode.val) <  obj.value){
                obj.value = Math.abs(root.val - obj.previousNode.val);
            }
        } 

        obj.previousNode = root;
        
        useInorderDFS(root.right, obj);

       

        }

    }



 
  