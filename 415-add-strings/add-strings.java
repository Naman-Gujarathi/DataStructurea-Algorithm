class Solution {
    public String addStrings(String num1, String num2) {
       
        int num1Idx = num1.length() -1;
        int num2Idx = num2.length() - 1;

        StringBuffer sb = new StringBuffer();
        int carry = 0;

        int sum = 0;

        int number1 = 0;

        int number2 = 0;

        int nth_sum = 0;
      
        while(num1Idx >= 0 || num2Idx >= 0){
            sum = 0;
            if(num1Idx >= 0){
                 number1 = num1.charAt(num1Idx) - '0';
            }else{
                number1 = 0;
            }
           
            if(num2Idx >= 0){
                  number2 = num2.charAt(num2Idx) - '0';
            } else{
                number2 = 0;
            }
          
            sum = number1 + number2 + carry;
            nth_sum = sum % 10;
            carry = sum / 10;
            sb.append(nth_sum);

            if(num1Idx >=0){
                num1Idx--;
            }
            if(num2Idx >= 0){
                num2Idx--;
            }
             
        }

        if(carry > 0){
            sb.append(carry);
        }
        // while(num1Idx >=0 ){
        //     int number1 = num1.charAt(num1Idx) - '0';
           
        //     sum = number1 + carry;
        //     int nth_sum = sum % 10;
        //     carry = sum / 10;
        //     sb.append(nth_sum);

        // }

        return sb.reverse().toString();
    }
}