package Trees;

class Node {
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}

public class IdenticalTrees {

    Node root;
    Node root1;
    boolean checkIdenticalTrees(Node node, Node node1) {
        if(node == null && node1 == null) return true;
            
        if( node1 == null || node == null || node.data != node1.data ) return false;

        boolean value = checkIdenticalTrees(node.left, node1.left); 
        if (value == false) return false;
           
        
        boolean value1 = checkIdenticalTrees(node.right, node1.right); 
        if (value1 == false) return false;

        return true;
        
    }

    public static void main (String args[]) {
        IdenticalTrees obj = new IdenticalTrees();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.right = new Node(3);
        obj.root1 = new Node(1);
        obj.root1.left = new Node(2);
        obj.root1.right = new Node(3);
        obj.root1.left.right = new Node(3);

        boolean result = obj.checkIdenticalTrees(obj.root, obj.root1);
        System.out.println("is it identical tree ? " + result);
        
    }
    
}
