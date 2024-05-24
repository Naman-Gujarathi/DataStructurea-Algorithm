public class palindrome {


   boolean function (int left,  String str) {
      int right = str.length()-1-left;
       if (left >= right) {
        System.out.println("It is plaindrome");
        return true;
       }

       if(str.charAt(left)!=str.charAt(right)) {
            System.out.println("It is not plaindrome");
            return false;
       }

       return function(++left, str);



    }

    public static void main (String args[]) {

        String str = "madam";
        
        int length =str.length();

        palindrome obj = new palindrome();

        boolean value =obj.function (0,  str );

        System.out.println(value);
    }
    
}
