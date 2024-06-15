class Solution {
    public String decodeString(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<s.length(); i++){ 
                if(s.charAt(i) == ']'){
                    StringBuffer sb = new StringBuffer();
                    sb = sb.append("");
                    while(stack.peek() != '['){
                        sb = sb.insert(0, stack.pop());    //  leetcode
                    }
                    stack.pop();
                    int repeat =0;
                    int number =0;
                    int base = 1;
                    while(!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9'){
                        number = stack.pop() - '0'; 
                        repeat = repeat + number * base;
                        base = base *10;
                    }
                    
                    String newString = "";
                      for (int j = 0; j < repeat; j++) {
                            newString = newString + sb.toString();
                       }

                    
                    for(int m=0; m<newString.length(); m++){
                        stack.push(newString.charAt(m));// 3
                    }

                } else {
                    stack.push(s.charAt(i));//  1 0 
                }
            }
            String result = "";
            while(!stack.isEmpty()){
                result = stack.pop() + result;
            }

            return result;

    }
   
}