package Trees;
import java.util.ArrayList;

import java.util.function.Function;

public class BFS {

      function (Node node, list) {

        if(node == null) {
            return;
        }

       System.out.println(node.data);
     

       if(node.left != null) {
           list.add(node.left);
        if(node.right != null)
           list.add(node.right);
       }

       if(list.size() != null) {
           list.remove(0);
       }
      

      for (int i=0; i<list.size(); i++) {
            function(list.get(i), list);
      }


     

    }


    
        public static void main (String args[]) {

            ArrayList<Node> list = new ArrayList<>();
        }
    }
      

        



   
