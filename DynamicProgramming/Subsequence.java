import java.util.ArrayList;

//Print all subsequences

public class Subsequence {

    void function(int[] arr, int i, ArrayList<Integer> list) {
        int n = arr.length;
        if (i == n) {
            // for (int element : list) {
                System.out.println(list);
            // }
            return;
        }

        list.add(arr[i]);
        function(arr, i + 1, list);
        list.remove(list.size()-1);
        function(arr, i + 1, list);

    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 2 };
        ArrayList<Integer> list = new ArrayList<>();
        Subsequence obj = new Subsequence();
        obj.function(arr, 0, list);

    }

}
