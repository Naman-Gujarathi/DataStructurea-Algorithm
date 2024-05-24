package Trees;

import java.util.*;


// This code may fail for 
//                     1
//           2   
//    4           3  (3 is right child of 2)  
// 6    7      8      9


class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class BorderTraversal {

    Node root;

    void printLeftBorderTraversal(Node node, ArrayList<Integer> borderList) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            return;
        } else {
            borderList.add(node.data);
        }

        printLeftBorderTraversal(node.left, borderList);

        if (node.left == null) {
            System.out.println("node.right " + node.right);
            printLeftBorderTraversal(node.right, borderList);
        }

    }

    void printRightBorderTraversal(Node node, ArrayList<Integer> rightBorderList, int[] flag) {
        if(node == null) {
            return;
        }
        if(node.right == null && node.left == null ) {
            return;
        }
        if(flag[0] != 1) {
            rightBorderList.add(node.data);
        }
        if(node.right != null) // just to make 
        flag[0] =0;
        printRightBorderTraversal(node.right, rightBorderList, flag);

        if(node.right == null){
            printRightBorderTraversal(node.left, rightBorderList, flag);
        }


 
    }

    void printLeafBorderTraversal(Node node, ArrayList<Integer> borderList) {
        if(node == null) {
            return;
        }

        if(node.left == null && node.right == null) {
            borderList.add(node.data);
        }

        printLeafBorderTraversal(node.left, borderList);
        printLeafBorderTraversal(node.right, borderList);

    }
    // 1 2 4 7 3 5 

    //    1
    //  2   3
    //   4 5 
    //  7   15
    // 8 9
    public static void main(String args[]) {
        BorderTraversal obj = new BorderTraversal();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        // obj.root.right = new Node(3);
        // obj.root.right.left = new Node(5);
        obj.root.left.left = new Node(3);
        obj.root.left.left.left = new Node(4);
        // obj.root.left.right.right = new Node(9);

    //        1
    //     2   
    //  4     3    
    // 6 7   8 9 
  



        // obj.root.right.right = new Node(5);
        // obj.root.left.left = new Node(4);
        // obj.root.left.left.right = new Node(7);
        // obj.root.left.left.left = new Node(6);
        // obj.root.right.right.left = new Node(8);
        // obj.root.right.right.right = new Node(9);
        // obj.root.left.right.left.left = new Node(8);
        // obj.root.left.right.left.right = new Node(9);
        ArrayList<Integer> borderList = new ArrayList<>();
        ArrayList<Integer> rightBorderList = new ArrayList<>();

        obj.printLeftBorderTraversal(obj.root, borderList);
        // System.out.println(" borderList: " + borderList);
        obj.printLeafBorderTraversal(obj.root, borderList);
        int flag[] = {1};
        obj.printRightBorderTraversal(obj.root, rightBorderList, flag);
        for(int i =0; i<rightBorderList.size(); i++) {
            borderList.add(rightBorderList.get(rightBorderList.size()-1-i));
        }
        System.out.println(" borderList  " + borderList);

    }

}
