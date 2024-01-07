package Trees;

import java.util.Stack;

public class Nod{

    Nod left;
    Nod right;
    int data;

    public Nod(int key) {
        this.data = key;
    } 
    // 1
    // 2 3
    // 4 5

    // 1,2,4,5,3

    // Stack 4, 5
    // result 1, 3, 2, 5, 4
    public static void main(String args[]) {

        Nod root = new Nod(1);
        root.left = new Nod(2);
        root.right = new Nod(3);
        root.left.left = new Nod(4);
        root.left.right = new Nod(5);

        Stack<Nod> stack = new Stack<>();

        if (root == null) {
            return;  }

        stack.push(root);

        while (!stack.isEmpty()) {
            Nod node = stack.pop();
            System.out.print(node.data+ " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }

        }

    }

}
