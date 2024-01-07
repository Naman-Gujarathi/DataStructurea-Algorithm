public class Reverse {

    


    void function (int i, int n, int arr[]) {
        
        if(i>=n) {
            return;
        }
        int temp =arr[i];
        arr[i]= arr[n];
        arr[n] = temp;

      

        function (i+1, n-1, arr);


    }


    public static void main (String args[]) {

        int arr[] = {1,2,3,4,5};
        int n= arr.length-1;
        Reverse obj = new Reverse();
        obj.function(0, n, arr);
        for(int i=0; i<=n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    
}
