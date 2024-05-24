package Trees;
import java.util.*;
// pritned level by level

class Node {
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}
public class LevelOrderTraversal {
    Node root;

    void printLevelOrderTraversal( Queue<Node> queue) {
    
        while(!queue.isEmpty()) {
            int size = queue.size(); 
            for(int i=0; i<size; i++ ) {  
                Node poppedNode = queue.poll();
                System.out.print(" " + poppedNode.data);
                if(poppedNode.left != null)  {
                    queue.add(poppedNode.left);
                }
                if(poppedNode.right != null) {
                    queue.add(poppedNode.right);
                }

            }
            System.out.println(" ");
           
        }
       
    }

    public static void main (String args[]) {
        LevelOrderTraversal obj = new LevelOrderTraversal();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.root.right.left = new  Node(8);
        obj.root.right.right = new Node(10);
        Queue<Node> queue = new LinkedList<>();
        queue.add(obj.root);
        obj.printLevelOrderTraversal(  queue);

        // 1 2 3 4 5 8 10
    }
    
}
