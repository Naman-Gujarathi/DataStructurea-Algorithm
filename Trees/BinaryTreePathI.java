package Trees;

import java.util.*;


class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode( int val) {
        this.val = val;
    }
}

public class BinaryTreePathI {

    public List<List<Integer>> BinaryTreePathIs(TreeNode root) {
        List<List<Integer>>resultList = new ArrayList<>();
        if(root == null ) return resultList;
        List<Integer> currentList = new ArrayList<Integer>();

        findBinaryTreePathIs(root, resultList, currentList);
        System.out.println("resultList " + resultList);
        return resultList;
    }

    void findBinaryTreePathIs(TreeNode node , List<List<Integer>> resultList, List<Integer> currentList ) {
        if(node == null) return;
        currentList.add(node.val);
        if(node.left== null && node.right == null) { 
             System.out.println("currentList" + currentList);
            resultList.add(new ArrayList<>(currentList));
            System.out.println("resultList" + resultList);
            return ;
        }  // 
        // 1,2,
        //[[1,2,4], [1,2,5]]
        
        
        // System.out.println("sb before left and right" + sb);
        
        findBinaryTreePathIs(node.left, resultList, currentList);
        if(node.left != null)
        currentList.remove(currentList.size()-1);
        // sb.delete(initialLength,sb.length());
       
        findBinaryTreePathIs(node.right, resultList, currentList);
        if(node.right != null)
        currentList.remove(currentList.size()-1);
        
    }
    public static void main(String args[]) {
        BinaryTreePathI tree = new BinaryTreePathI();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new  TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        tree.BinaryTreePathIs(root);
    }
}
