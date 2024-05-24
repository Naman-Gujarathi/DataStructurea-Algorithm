
// 0 1 1 2 3 5 8 13 

public class Fibonacci {


    int function(int n) {

        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }

       return  function(n-1) + function(n-2);
    }
   
    public static void main (String args[]) {

       Fibonacci obj = new Fibonacci();
       int value = obj.function(10);
       System.out.println(value);

    }
    
}
