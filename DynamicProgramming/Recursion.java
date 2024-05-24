public class Recursion {

  void  fun(int i) {
       
       if(i>=10) {
        return;
       }

        i++;
        fun(i);
        System.out.println(i);
       
        
      
    }


    public static void main(String args[]) {
       
        Recursion obj = new Recursion();
        obj.fun(0);


    }
    
}
