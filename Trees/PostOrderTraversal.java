package Trees;

class Node {

    Node left;
    Node right;
    int data;
    public Node (int data) {
        this.data = data;
    }
    
}

public class PostOrderTraversal {
    Node root;
    void printPostOrderTraversal ( Node node) {

        if (node == null) {
            return;
        }

        printPostOrderTraversal(node.left);
        printPostOrderTraversal(node.right);
        System.out.print(" " + node.data);


    }



    public static void main (String args[]) {
         PostOrderTraversal obj = new PostOrderTraversal();
         obj.root = new Node(5);
         obj.root.left = new Node(4);
         obj.root.right = new Node(3);
         obj.root.left.left = new Node(2);
         obj.root.left.right = new Node(1);
         // result : 2 1 4 3 5 
         obj.printPostOrderTraversal(obj.root); 

         

    }
}


