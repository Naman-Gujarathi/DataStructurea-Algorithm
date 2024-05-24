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

public class BinaryTreePath {

    public List<String> binaryTreePaths(TreeNode root) {
         List<String> resultList = new ArrayList<>();
        if(root == null ) return resultList;
        StringBuffer sb = new StringBuffer();

        findBinaryTreePaths(root, resultList, sb);
        System.out.println("resultList " + resultList);
        return resultList;
    }

    void findBinaryTreePaths(TreeNode node , List<String> resultList, StringBuffer sb) {
        if(node == null) return;
        int initialLength = sb.length();
        sb.append(node.val);
        if(node.left== null && node.right == null) {
            
            resultList.add(sb.toString());
            sb.delete( initialLength, sb.length());
            return ;
        }  // initialLength = 0, 2 , 4  currLength = 4
        // 1->3->
        //[1->2->4,1->2->5 ]
        
        sb.append("->");
        System.out.println("sb before left and right" + sb);
        findBinaryTreePaths(node.left, resultList, sb);
        // sb.delete(initialLength,sb.length());
       
        findBinaryTreePaths(node.right, resultList, sb);
        System.out.println("sb after left and right" + sb);
        sb.delete( initialLength, sb.length());
        
    }
    public static void main(String args[]) {
        BinaryTreePath tree = new BinaryTreePath();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new  TreeNode(6);
        root.right.right = new TreeNode(7);
        tree.binaryTreePaths(root);
    }
}
