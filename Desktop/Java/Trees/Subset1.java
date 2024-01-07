package Trees;

import java.util.ArrayList;
import java.util.Arrays;

public class Subset1 {

    void subset( ArrayList<Integer> list, int arr[], int index,  ArrayList<ArrayList<Integer>> resultList) {
        
        resultList.add(list);
        for(int i = index; i < arr.length; i++ ) {
           if(i != index && arr[i]== arr[i-1] ) continue;
            list.add(arr[i]);
            System.out.println(list);
            subset(list, arr, i+1, resultList);
            list.remove(list.size()-1);

        }
    }


    public static void main(String args[]) {

        Subset1 obj = new Subset1();
        int arr[] = {1,2,2,3};
        Arrays.sort(arr);
       
        int index =0;
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>(); 
        obj.subset(new ArrayList<Integer>(), arr, index, resultList);
       
    }
    
}
