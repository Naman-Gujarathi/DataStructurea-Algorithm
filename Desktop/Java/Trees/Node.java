package Trees;

public class Node {

    int data;
    Node left;
    Node right;

    public Node (int key) {
        this.data = key;
    }


    public static void main (String args[]) {

         Node root = new Node(2);
         root.left = new Node(1);
         root.right = new Node(3);
    }
    
}








