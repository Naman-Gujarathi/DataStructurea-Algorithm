package Trees;


class Node {
    Node left;
    Node right;
    int data;
    public Node( int data) {
        this.data = data;
    }
}

public class BalancedTrees {
    Node root;
 
    int checkHeightTree( Node node) {
        if(node == null) {
            return 0;
        }

        int left = checkHeightTree(node.left);
        if(left == -1) return -1;
        
        int right = checkHeightTree(node.right);
        if(right == -1) return -1;

        if (Math.abs(left - right) > 1){
            return -1;

        }
        return Math.max(left, right) + 1;
    }
        boolean checkBalancedTree( Node node) {
           return checkHeightTree(node) != -1;

        }



    public static void main (String args[]) {
        BalancedTrees obj = new BalancedTrees();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new  Node(4);
        obj.root.left.left.left = new Node(7);
        boolean value = obj.checkBalancedTree(obj.root);
        System.out.println(value);
        
    }
    
}
