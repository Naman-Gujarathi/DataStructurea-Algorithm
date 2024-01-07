public class Recursion1 {
    

    void fun(int counter, int n) {

        if(counter == n) return ;

        counter++;
        System.out.println("Naman");
        fun(counter, n);
    }

    public static void main(String args[]) {
        Recursion1 obj = new Recursion1();
        obj.fun(0, 5);
    }  
}
