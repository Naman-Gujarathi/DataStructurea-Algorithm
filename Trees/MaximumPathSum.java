package Trees;

class Node  {
    Node left;
    Node right;
    int data;
    public Node(int data) {
        this.data = data;
    }
}

public class MaximumPathSum {
    Node root;

    int maxPathSum(Node node, int []maxSum) {

        if(node == null) return 0;
        int left  = maxPathSum(node.left, maxSum);
        int right = maxPathSum(node.right, maxSum);
        maxSum[0] = Math.max(maxSum[0], left + right + node.data);
        return Math.max(left,right)+ node.data;

    }
    public static void main (String args[]) {
        MaximumPathSum obj = new MaximumPathSum();
        obj.root = new Node(-10);
        obj.root.left = new Node(9);
        obj.root.right = new Node(20);
        obj.root.right.left = new Node(15);
        obj.root.right.right = new Node(7);
        int maxSum[] = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        obj.maxPathSum(obj.root, maxSum);
        System.out.println("Max Path Sum " + maxSum[0]);
    }
}
