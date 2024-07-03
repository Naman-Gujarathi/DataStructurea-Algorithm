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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 1){
            return new TreeNode(preorder[0]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
       
       
        // TreeNode root = new TreeNode(preorder[0]);
        return findTree(  map, preorder, 0, preorder.length -1, inorder, 0, inorder.length -1);
        
    }

    TreeNode findTree(  HashMap<Integer, Integer> map, int[] preorder, int poLeft, int poRight, int[] inorder, int ioLeft, int ioRight){
         if(poLeft > poRight || ioLeft > ioRight) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[poLeft]);
        int rootIdx =  map.get(preorder[poLeft]);
        int leftTreeSize = rootIdx - ioLeft;

        root.left = findTree( map, preorder, poLeft + 1,poLeft + leftTreeSize , inorder, ioLeft, rootIdx -1);
        root.right = findTree( map, preorder, poLeft + leftTreeSize  + 1, poRight, inorder, rootIdx + 1, ioRight);

        return root;
    }
}