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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return createTree(map, inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    TreeNode createTree(HashMap<Integer, Integer> map,int[] inorder, int ioStart, int ioEnd, int[] postorder, int poStart, int poEnd){
        if(ioStart > ioEnd || poStart > poEnd ){
            return null;
        }

        TreeNode root = new TreeNode(postorder[poEnd]);
        int idx = map.get(postorder[poEnd]);
        int leftSize = idx - ioStart;

        root.left = createTree(map, inorder, ioStart, idx-1, postorder, poStart, poStart + leftSize -1 );
        root.right = createTree(map, inorder, idx + 1, ioEnd, postorder, poStart + leftSize, poEnd -1);

        return root;
        
    }
}