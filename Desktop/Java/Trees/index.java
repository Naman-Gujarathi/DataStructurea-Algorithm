package Trees;
import java.util.ArrayList;  




public class index {

    
    // boolean flag = false;
   int subsequence(int arr[],  int index, int arr_Length, int sum_Subsequence, int curr_Sum) {
        // if array is postive using this if block
        if (curr_Sum > sum_Subsequence) {
            return 0;
        }
        if(index> arr_Length ) {

            // if (flag == false)
            if(curr_Sum == sum_Subsequence) {
            // System.out.println("Subsequence " + list);
            // flag = true;
            return 1;
          }

          return 0;

        }

        // list.add(arr[index]);
        curr_Sum = curr_Sum + arr[index];

       int left =subsequence(arr, index+1, arr_Length, sum_Subsequence, curr_Sum ) ;
    //    == true) {
        //     return true;
        // }
        // if (subsequence(arr, list, index+1, arr_Length, sum_Subsequence, curr_Sum ) == false) {
        //     return false;
        // }
        curr_Sum = curr_Sum - arr[index];
        // list.remove(list.size()-1);
        int right = subsequence(arr,  index+1, arr_Length, sum_Subsequence, curr_Sum );
        // ) == true) {
        //     return true;
        // }
        // if (subsequence(arr, list, index+1, arr_Length, sum_Subsequence, curr_Sum ) == false) {
        //     return false;
        // }

        return left + right;

    }

    public static void main (String args[]){ 
       
        int arr[] = {3,1,2};
        int sum_Subsequence = 15;
        int n = arr.length -1;
        // ArrayList<Integer> list = new ArrayList<>(); 
        index obj = new index();
       int value =obj.subsequence(arr,  0, n, sum_Subsequence, 0);
       System.out.println(value);

    }
    
}
