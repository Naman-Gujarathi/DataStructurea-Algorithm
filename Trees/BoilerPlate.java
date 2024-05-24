package Trees;


class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode( int val) {
        this.val = val;
    }
}

public class BoilerPlate {

   

    public static void main(String args[]) {
        BoilerPlate tree = new BoilerPlate();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new  TreeNode(8);
        root.right.right = new TreeNode(10);
       
    }
}
