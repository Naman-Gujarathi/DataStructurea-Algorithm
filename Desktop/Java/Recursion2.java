// public class Recursion2 {
  
//     void function(int i, int n, int sum) {
//         if (i > n) {
//             System.out.println("SUM " + sum);
//             return;
//         }
//         sum = sum + i;
        
//         function(++i, n, sum );
//         // System.out.println(i);


//     }

//     public static void main(String args[]) {

//         Recursion2 obj = new Recursion2();
//         obj.function(1, 8, 0);

//     }

// }



public class Recursion2 {
  
    int function (int n) {
        if ( n == 1) {
            return 1;
        }
       return n * function(n-1);
    }

    public static void main(String args[]) {

        Recursion2 obj = new Recursion2();
       int  result = obj.function( 10);
       System.out.println(result);

    }

}