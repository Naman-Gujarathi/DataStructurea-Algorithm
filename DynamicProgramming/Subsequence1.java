import java.util.ArrayList;

// Print all Subsequence whose sum is equal to K

public class Subsequence1 {

  

    void function(int arr[], int index, int k, ArrayList<Integer> list, int sum) {

        if (index >= arr.length) {
           
            if (sum == k ) {
                System.out.println(list);  
            }
            return;

        }

        list.add(arr[index]);
        sum = sum + arr[index];
        function(arr, index + 1, k, list, sum );
        if(sum == k) {

        }
        // sum = sum - list.get(list.size()-1);
        list.remove(list.size() - 1);
        sum = sum - arr[index];
   
        function(arr, index + 1, k, list, sum);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 1 };
        ArrayList<Integer> list = new ArrayList<>();
        Subsequence1 obj = new Subsequence1();
        obj.function(arr, 0, 2, list, 0);

    }

}



