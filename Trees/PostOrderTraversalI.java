package Trees;

import java.util.*;
// Created User Input Tree and implemented both PostOrderTraversal and LevelOrderTraversal

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;

    }
}

public class PostOrderTraversalI {
    Node root;

    void createTree(Node node, Scanner sc) {
        System.out.println("Left Node for node " + node.data);
        int nodeDataLeft = sc.nextInt();
        if (nodeDataLeft != -1) {
            node.left = new Node(nodeDataLeft);
            createTree(node.left, sc);
        }

        System.out.println("Right Node for node " + node.data);
        int nodeDataRight = sc.nextInt();
        if (nodeDataRight != -1) {
            node.right = new Node(nodeDataRight);
            createTree(node.right, sc);
        }

    }

    void printPostOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        printPostOrderTraversal(node.left);
        printPostOrderTraversal(node.right);
        System.out.print(" " + node.data);

    }


    void printLevelOrderTraversal( Queue<Node> queue) {
        while(!queue.isEmpty()) {
            Node poppedNode = queue.poll();
            System.out.print(" " + poppedNode.data);
            if(poppedNode.left != null)  {
                queue.add(poppedNode.left);
            }
            if(poppedNode.right != null) {
                queue.add(poppedNode.right);
            }
        }
       
    }

    public static void main(String args[]) {
        PostOrderTraversalI obj = new PostOrderTraversalI();
        Queue<Node> queue = new LinkedList<>();
        System.out.println("Create a user defined tree by entering value");
        System.out.println("Enter -1 for null node");
        System.out.println("Enter root node value");
        Scanner sc = new Scanner(System.in);
        int nodeData = sc.nextInt();
        if (nodeData != -1) {
            obj.root = new Node(nodeData);
            obj.createTree(obj.root, sc);
        }
        if (nodeData == -1) {
            System.out.println("It is null tree");
        } else {
            System.out.println("Printing Tree values for Post Order Traversal");
            obj.printPostOrderTraversal(obj.root);
            queue.add(obj.root);

            System.out.println("Level Order Traversal output : ");
            obj.printLevelOrderTraversal(queue);
        }

        sc.close();

        // 4 5 2 3 1
    }

}
