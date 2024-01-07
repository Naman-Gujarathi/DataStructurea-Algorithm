package Trees;
import java.util.*;

public class PermutationI {

    

    void permutation (ArrayList<Integer> list, ArrayList<ArrayList<Integer>> finalList,int arr[], int index  ) {

        if(index >= arr.length) {
            for (int a : arr) {
                list.add(a);
            }
            finalList.add(new ArrayList<Integer>(list));
            list.clear();
          

        }

        for (int i =index; i< arr.length; i++ ) {

            swap( index, i , arr);
            permutation(list, finalList, arr, index +1 );
            swap( index, i , arr);

        }

    }

       void swap (int i, int j, int arr[]) {

        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


    public static void main (String args[]) {

        PermutationI obj  = new PermutationI();
        int arr[] = {1,2,3};
        int index =0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        obj.permutation(list, finalList, arr, index);
        System.out.println(finalList);



    }
    
}
