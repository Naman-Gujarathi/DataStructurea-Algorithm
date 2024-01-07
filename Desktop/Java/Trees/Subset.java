package Trees;
import java.util.*;

public class Subset {


    void getSubset (int index, int arr[], int sumCurrentList, ArrayList<Integer> list, int arrLength, ArrayList<Integer> resultList, HashMap< ArrayList<Integer>, Integer> map  ) {

        if(index > arrLength) {
            if(!map.containsKey(list)) {
                // System.out.println("list" + list);
                map.put(new ArrayList<>(list), sumCurrentList);
            }
            // System.out.println(map);
            // resultList.add(sumCurrentList);

            return;
        }

        list.add(arr[index]);
        
        sumCurrentList = sumCurrentList + arr[index];
       
       
        getSubset(index + 1, arr, sumCurrentList, list, arrLength,resultList, map );
        
        
        sumCurrentList = sumCurrentList - arr[index];
        list.remove(list.size()-1);
        getSubset(index + 1, arr, sumCurrentList, list, arrLength, resultList, map);

    }



    public static void main (String args[]) {
        int arr[] = {1, 2, 2};
        int arrLength = arr.length -1;
        int sumCurrentList =0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        Subset obj = new Subset();
        obj.getSubset(0, arr, sumCurrentList, list, arrLength, resultList, map );
        // System.out.println(resultList);
        System.out.println(map);
    }
    
}
