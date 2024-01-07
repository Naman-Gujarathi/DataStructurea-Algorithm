package Trees;



// left root right


class Node {

    int data;
    Node left;
    Node right;

    public Node (int key) {
        this.data = key;
    }
}



public class inorder {

    

    Node node;

    void function (Node node) {

        if(node == null){
            return;
        }

       function(node.left); 

       System.out.print(node.data + " ");

        function(node.right);
    }


    public static void main (String args[]) {

        inorder obj = new inorder();
        obj.node = new Node(1);
        obj.node.left = new Node(2);
        obj.node.right = new Node(3);
        obj.node.left.right = new Node(4);
        obj.node.left.left = new Node(5);


//             1
//          2     3
//       5    4
// 5, 2, 4, 1, 3

        obj.function(obj.node);

    }
    

}
