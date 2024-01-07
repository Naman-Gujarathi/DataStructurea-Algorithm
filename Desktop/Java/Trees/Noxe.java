package Trees;

import javax.swing.RootPaneContainer;
import javax.swing.text.AbstractDocument.LeafElement;

// root left right  

public class Noxe {

    Noxe left,
    Noxe right,
    int data;

    public Noxe (int key) {
        this.data = key;
    }

    function (Noxe root) {

        if (root != null)
        System.out.println(root.data);

        if (root.left != null)
        function(root.left);
    
        if(root.right != null)
        function(root.right);
       

       }

    public static void main (String args[]) {


        Noxe root = new Noxe(1);
        root.left = new Noxe(2);
        root.right = new Noxe(3);
        root.right.left = new Noxe(4);
        root.left.right = new Noxe(5);
        root.left.left = new Noxe(4);


        root.function(1);






       // root, left, right
        //Pure Tree ka code likhna hai 
        // return likhne ki jarrurat nhi q ki vo ho jaaega program terminate hone p

      
       
       


    }
    
}
