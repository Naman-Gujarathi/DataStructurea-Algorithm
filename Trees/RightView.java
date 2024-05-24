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

public class RightView {
     //             1              
     //          2      3
     //        4    56      7         
     //                 8
     //     
    
     TreeNode root;

     public List<Integer> rightSideView(TreeNode root)  {
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        queue.add(root);
        storeRightView(queue, resultList);
        System.out.println(resultList);
        return resultList;
     }

     void storeRightView (Queue<TreeNode> queue, ArrayList<Integer> resultList) {
         
         while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode poppedNode = queue.poll();
                if(i==0) resultList.add(poppedNode.val);
            
                if(poppedNode.right != null) {
                    queue.add(poppedNode.right);
                } 
                if(poppedNode.left != null) {
                    queue.add(poppedNode.left);
                } 
            }
           
         }
     }

     public static void main(String args[]) {
        RightView  obj = new RightView ();
         obj.root = new TreeNode(1);
         obj.root.left = new TreeNode(2);
         obj.root.right = new TreeNode(3);
         obj.root.left.left = new TreeNode(4);
         obj.root.left.right = new TreeNode(5);
         obj.root.left.right.left = new TreeNode(15);
         obj.root.right.left = new  TreeNode(8);
         obj.root.right.right = new TreeNode(10);
         obj.rightSideView(obj.root);
     
     }

     
}

