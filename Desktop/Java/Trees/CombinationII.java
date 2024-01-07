package Trees;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationII {


    void combine ( ArrayList<Integer> list, ArrayList<ArrayList<Integer>> returnList, int listSum, int index, int arr[], int target) {

        if(listSum == target ) {
            returnList.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i= index; i<arr.length; i++) {
            if(i> index && arr[i]==arr[i-1]) continue;
            if (arr[i] > target ) break;
            list.add(arr[i]);
            listSum = listSum + arr[i];
            combine(list, returnList, listSum, i+1, arr, target);
            listSum = listSum - arr[i];
            list.remove(list.size()-1);
        }
    }

    public static void main(String args[]) {
        CombinationII obj = new CombinationII();
       
        int target = 5;
        int arr[] = {1,1,4,3,2,6,7};
        ArrayList<ArrayList<Integer>> returnList = new ArrayList<>();
        Arrays.sort(arr);
        int listSum = 0;
        int index =0;

        obj.combine(new ArrayList<>(), returnList, listSum, index, arr, target );
        System.out.println(returnList);

    }
    
}
