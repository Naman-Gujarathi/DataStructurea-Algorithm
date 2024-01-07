package Trees;
import java.util.ArrayList;

public class Combination {

    void function(int index, int required_Sum, ArrayList<Integer> list, int arr[],int arr_Length) {

        if(index > arr_Length) {
            // System.out.println("out of bound index " + index);
            // System.out.println("list " + list);

            if(required_Sum == 0) {
                System.out.println(list);    
            } 
            return;  
        }

        
        if(required_Sum >= arr[index] ) {
            list.add(arr[index]);
            function(index,required_Sum - arr[index], list, arr, arr_Length );
            list.remove(list.size()-1);
           
        }
        
        
        function(index + 1, required_Sum, list, arr, arr_Length);

    }

    
    public static void main (String args[]) {
        int arr[] = {2, 3, 6, 7};
        int arr_Length = arr.length - 1;
        int required_Sum = 7;
        ArrayList<Integer> list = new ArrayList<>();

        Combination obj = new Combination();
        obj.function(0, required_Sum , list, arr, arr_Length);


    }
    
}
