package Trees;


class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode( int val) {
        this.val = val;
    }
}

public class Symmetrical {

    public boolean isSymmetric (TreeNode root) {

        return compareTrees(root.left, root.right);
    }

    boolean compareTrees(TreeNode leftTreeNode, TreeNode rightTreeNode){

        if (leftTreeNode == null || rightTreeNode == null) return leftTreeNode == rightTreeNode;
        if(leftTreeNode.val != rightTreeNode.val) return false;



        boolean value = compareTrees(leftTreeNode.left, rightTreeNode.right);
        if(value == false) return false;

        boolean value1 =compareTrees(leftTreeNode.right, rightTreeNode.left);
        if(value1 == false) return false;

        return true;
    }
   

    public static void main(String args[]) {
        Symmetrical tree = new Symmetrical();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new  TreeNode(5);
        root.right.right = new TreeNode(4);
        boolean result = tree.isSymmetric(root);
        System.out.println("isSymmetric ? " + result);
       
    }
}