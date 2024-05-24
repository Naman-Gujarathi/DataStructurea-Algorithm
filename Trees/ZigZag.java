package Trees;

import java.util.*;

// 

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class ZigZag {
    Node root;

    void printZigZag(Node node, Stack<Node> primary, Stack<Node> secondary, boolean flag) {
        primary.push(node);
        while (!primary.isEmpty()) {
            int size = primary.size();
            for (int i = 0; i < size; i++) {
                // System.out.println("check for 1,2 and 4 " + primary.size());
                // System.out.println("i " + i);
                Node poppedNode = primary.pop();
                System.out.print(" " + poppedNode.data);
                if (flag == true) {
                    if (poppedNode.left != null)
                        secondary.push(poppedNode.left);
                    if (poppedNode.right != null)
                        secondary.push(poppedNode.right);

                } else {
                    if (poppedNode.right != null)
                        secondary.push(poppedNode.right);
                    if (poppedNode.left != null)
                        secondary.push(poppedNode.left);

                }

            }
            flag = !flag;

            // System.out.println("primary <-- secondary " + primary.size());
            while (primary.isEmpty()) {

                Stack<Node> temp = primary;
                primary = secondary;
                secondary = temp;

            }
            // System.out.println(" secondary is empty? " + secondary.size());
            // System.out.println("primary <-- secondary checking again " + primary.size());

        }
    }

    public static void main(String args[]) {
        ZigZag obj = new ZigZag();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.root.right.left = new Node(6);
        obj.root.right.right = new Node(7);
        obj.root.right.left.left = new Node(8);
        obj.root.right.left.right = new Node(9);
        obj.root.right.right.left = new Node(10);
        obj.root.right.right.right = new Node(11);
        Stack<Node> primary = new Stack<Node>();
        Stack<Node> secondary = new Stack<Node>();
        boolean flag = true;
        obj.printZigZag(obj.root, primary, secondary, flag);

    }

}

// My previous code :
// while(primary.isEmpty()) {
// primary = secondary ;
// while(!secondory.isEmpty()) {
// secondory.pop(); }
// I understand your concern, and it's an important point to clarify about how
// reference assignment works in Java. Let's go through the logic step by step
// to clarify the behavior:

// 1. **Initial Condition**:
// - `primary` refers to Stack A (which is now empty).
// - `secondary` refers to Stack B (which contains nodes).
// - `temp` is a new reference, not yet assigned to any stack.

// 2. **Swapping with a Temporary Reference (`temp`)**:
// - `temp = primary;` - Now, `temp` refers to Stack A (empty).
// - `primary = secondary;` - Now, `primary` refers to Stack B (with nodes).
// - `secondary = temp;` - Now, `secondary` refers to Stack A (empty).

// 3. **After Swapping**:
// - `primary` refers to what was originally `secondary` (Stack B, with nodes).
// - `secondary` now refers to what was originally `primary` (Stack A, empty).

// In your concern, you are wondering if `secondary = temp;` will make `primary`
// also refer to `temp` (and thereby to the original empty `primary`). However,
// this is not the case in Java. Here's why:

// - When you do `primary = secondary;`, you are making `primary` refer to the
// same object that `secondary` was referring to at that moment (Stack B). After
// this line, `primary` and `secondary` both refer to Stack B.
// - However, when you subsequently do `secondary = temp;`, you are changing
// what `secondary` refers to. Now `secondary` refers to Stack A (because `temp`
// was a reference to the original `primary`, which was Stack A).
// - This change in what `secondary` refers to does not affect `primary`.
// `primary` continues to refer to Stack B.

// This is because in Java, when you assign one reference to another, you're
// only copying the reference (the address of the object), not the object
// itself. After the copy, the two references point to the same object, but they
// are independent of each other. Changing one reference after the copy does not
// affect the other.

// So, to answer your question: After `secondary = temp;`, `secondary` refers to
// the original `primary` (Stack A, empty), but `primary` still refers to the
// original `secondary` (Stack B, with nodes).