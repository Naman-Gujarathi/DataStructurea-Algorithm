package Trees;

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class MaximumDepth {
    Node node;

    int findDepth(Node node) {
        if (node == null) {
            return 0;
        }

        return Math.max(findDepth(node.left), findDepth(node.right)) + 1;

    }

    public static void main(String args[]) {
        MaximumDepth obj = new MaximumDepth();
        obj.node = new Node(1);
        obj.node.left = new Node(2);
        obj.node.right = new Node(3);
        obj.node.left.left = new Node(5);
        obj.node.left.left.left = new Node(10);
        obj.node.left.right = new Node(9);
        int heightTree = obj.findDepth(obj.node);
        System.out.println("Heigt Tree " + heightTree);

    }

}
