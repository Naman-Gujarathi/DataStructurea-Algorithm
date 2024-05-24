package Trees;
import java.util.*;

class Node {
    Node left;
    Node right;
    int data;
    public Node( int data) {
        this.data = data;
    }
}

class QueueObj {
    
    Node node;
    int vertical_idx;
    public QueueObj(int vertical_idx, Node node) {
        this.node = node;
        this.vertical_idx = vertical_idx;   
    }
}

public class TopView {

  
    private void findTopView(Node root) {
       if(root == null) return;
       TreeMap<Integer, Integer> map = new TreeMap<>();
       Queue<QueueObj> queue = new LinkedList<>();
       calculateTopView(root, 0, map, queue);
    //    System.out.println(map);

    //    for(int key:map.keySet()){
    //       System.out.print(map.get(key));
    //    }

    for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.print(" " + entry.getValue());
    }

    }
     
    public void calculateTopView(Node node, int vertical_idx, TreeMap<Integer, Integer> map, Queue<QueueObj> queue ) {
        

        queue.add(new QueueObj(0, node));
        while(!queue.isEmpty()) {
            QueueObj poppedNode = queue.poll();
           
                map.put(poppedNode.vertical_idx,poppedNode.node.data );
            
            if(poppedNode.node.left != null) {
                queue.add(new QueueObj(poppedNode.vertical_idx -1, poppedNode.node.left ));
            }
            if(poppedNode.node.right != null) {
                queue.add(new QueueObj(poppedNode.vertical_idx +1, poppedNode.node.right ));
            }
        }

        // if(!map.containsKey(vertical_idx)) {
        //     map.put(vertical_idx, node.data);
        // }

        // calculateTopView(node.left, vertical_idx - 1, map, queue);

        // calculateTopView(node.right, vertical_idx + 1, map, queue);



    }

    public static void main(String args[]) {
        TopView tree = new TopView();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        tree.findTopView(root);

            //   best example to consider for this problem
            //       1
            //   2       3 
            //       4 
            //           5  
            //               6
            //

            //   best example to consider for this problem
            //           1
            //       2       3 
            //    4      56    7
            //               
            //               
            //




    }
}
