package Trees;

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class Diameter {

    Node root;

    int calculateDiameter(Node node, int[] maxDiameter) {

        if (node == null)
            return 0;

        int left = calculateDiameter(node.left, maxDiameter);
        int right = calculateDiameter(node.right, maxDiameter);
        maxDiameter[0] = Math.max(maxDiameter[0], left + right + 1);
        return Math.max(left, right) + 1;

    }

    public static void main(String args[]) {
        Diameter obj = new Diameter();
        obj.root = new Node(1);
        obj.root.left = new Node(2);
        obj.root.right = new Node(3);
        obj.root.left.left = new Node(4);
        obj.root.left.right = new Node(5);
        obj.root.right.left = new  Node(8);
        obj.root.right.right = new Node(10);
        int maxDiameter[] = new int[1];
        obj.calculateDiameter(obj.root, maxDiameter);
        System.out.println("Diameter " + maxDiameter[0]);
    }
}                        
            //      1
            //   2     3
            // 4  5   8 10
            