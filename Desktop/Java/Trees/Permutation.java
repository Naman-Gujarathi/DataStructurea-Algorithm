package Trees;

import java.util.Arrays;
import java.util.ArrayList;

public class Permutation {

    void permutate(int arr[], int markedArray[], ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> list, int index) {

        if(list.size() == arr.length) {
            resultList.add(new ArrayList<>(list));
            return;
        }
        
        for(int i= index; i< arr.length; i++) {
            if(markedArray[i]==1) continue;
            list.add(arr[i]);
            markedArray[i] = 1;
            permutate(arr, markedArray, resultList, list, 0);
            markedArray[i] = 0;
            list.remove(list.size()-1);
        }

    }




    public static void main(String args[]) {
        Permutation obj = new Permutation();
        int arr[] = {1,3, 3};
        int index =0;
        int markedArray[]= new int[arr.length];
        Arrays.fill( markedArray, 0);
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        obj.permutate(arr, markedArray, resultList, new ArrayList<>(), index );
        System.out.println(resultList);


    }
    
}
