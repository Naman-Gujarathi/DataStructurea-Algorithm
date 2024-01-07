package Trees.Recursion;

import java.util.*;

public class Plaindrome {

    void palindrome (String s, List<String> list, List<List<String>> finalList, int index) {
        
        if(index > s.length()-1) {
            finalList.add(new ArrayList<>(list));
            return;
        }
        
        for (int i=index; i<s.length(); i++) {
           if (checkPalindrome(index, i, s)) {

            // StringBuffer sb = new StringBuffer();
            // for(int j=index; j<=i;  j++) {
            //     sb.append(s.charAt(j));

            // }

            list.add(s.substring(index, i+1));
               
            // list.add(sb.toString());
            palindrome(s, list, finalList, i+1);
            list.remove(list.size()-1);  

           }

        }
    }

    boolean checkPalindrome (int index, int i , String s ) {

        // StringBuffer sb = new StringBuffer();
        // for(int j=index; j<=i;  j++) {
        //     sb.append(s.charAt(j));
        // }

        // String checkString = sb.toString();

        if (s.length() == 1) {
            return true;
        }

        // for(int k=0; k<s.length()/2; k++) {
        //     if (checkString.charAt(k) != checkString.charAt(checkString.length()-1-k)) {
        //         return false;

        //     }
        // }

        // return true;

        while(index<i) {
            if(s.charAt(index++) != s.charAt(i--)){
                return false;
            }
           

        }
        return true;

    }


    public static void main (String args[]) {

        Plaindrome obj = new Plaindrome();
        String s = "aabb";
       List<String> list = new ArrayList<>();
       List<List<String>> finalList = new ArrayList<>();
        int index =0;
        obj.palindrome(s, list, finalList,index  );
        System.out.println("final List " + finalList);
    }
    
}
