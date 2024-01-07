package Trees;
import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

   

}

public class BinaryTreeHeight {

    Node node;

    void function ( Node node, Scanner sc) {

        
        System.out.println("Enter Node value");
        node.data = sc.nextInt();

        if(node.data == -1) {
            return;
        }
        System.out.println("Enter Left child of value " + node.data);
        node.left = new Node();
        function ( node.left, sc );

        System.out.println("Enter Right child of value " + node.data);
        node.right = new Node();
        function ( node.right, sc );

    }

    void printTree(Node node) {
        if(node == null || node.data == -1) {
            return;
        }
        System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);


    }

    int heightTree (Node node) {

        if(node.data == -1 || node == null) {
            return 0;

        }
        return Math.max(heightTree(node.left), heightTree(node.right)) +1;
    }

  int balancedTree(Node node) {

    if (node.data == -1) {
        return 0;
       }
        int left = balancedTree(node.left);
        System.out.println("node" + node.data +"left" + left);
        if(left == -1) return -1;
       int right = balancedTree(node.right);
       System.out.println("node" + node.data +"right" + right);
       if(right == -1) return -1;
    
       if (Math.abs(left-right)>1) {
        System.out.println("left" + left);
        System.out.println("right" + right);
        return -1;
       }
    
       return Math.max(left, right) + 1;

        

    }

  


    //      3
    //   |    |
    //   2    2
    //   |     |   
    // -1 -1  1 -1
            //  |
            //  0

    public static void main (String args[]) {
        BinaryTreeHeight obj = new BinaryTreeHeight();
        obj.node = new Node();
        Scanner sc = new Scanner(System.in);
        
        obj.function(obj.node, sc);
        System.out.println("PreOrder Traversal");
        obj.printTree(obj.node);
        int height =obj.heightTree(obj.node);
        System.out.println("height" + height );
        int value =obj.balancedTree(obj.node);
        if(value == -1) {
            System.out.println("Not balanced Tree");
        } 
        else {
            System.out.println(" balanced Tree");
        }

    }


    
}
