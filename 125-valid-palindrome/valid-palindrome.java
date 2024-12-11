class Solution {
    public boolean isPalindrome(String s) {
          StringBuffer sb = new StringBuffer();

          if(s.trim().length() == 0) return true; // whitespaces 

          for(int i=0; i<s.length(); i++){
                if(((s.charAt(i) - '0') >= 0 && (s.charAt(i)) - '0' <= 9) || ((s.charAt(i) - '0') >= 17 && (s.charAt(i)) - '0' <= 42) || ((s.charAt(i) - '0') >= 49 && (s.charAt(i)) - '0' <= 74)){

                    if(((s.charAt(i) - '0') >= 17 && (s.charAt(i)) - '0' <= 90) || ((s.charAt(i) - '0') >= 42)){
                        sb.append(Character.toLowerCase(s.charAt(i)));
                    }else{
                        sb.append(s.charAt(i));
                    }
                    
                }
          } 
           
          

          String alphaNumericStr = sb.toString();
          char[] alphaNumericArr = alphaNumericStr.toCharArray();

          int left = 0;
          int right = alphaNumericArr.length - 1;

        //   System.out.println("arr" + alphaNumericArr);

        //   for(int i = 0; i<=right; i++){
        //     System.out.print( alphaNumericArr[i]);
        //   }

          while(left <= right){
            if(alphaNumericArr[left] != alphaNumericArr[right]){
                return false;
            }
            left++;
            right--;
          }

          return true;


         

        

          
    }
}

