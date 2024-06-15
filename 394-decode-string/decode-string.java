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
                    while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                        number = stack.pop() - '0'; 
                        repeat = repeat + number * base;
                        base = base *10;
                    }
                    
                    StringBuilder newString = new StringBuilder();
                      for (int j = 0; j < repeat; j++) {
                            newString = newString.append(sb.toString());
                       }

                    
                    for(int m=0; m<newString.length(); m++){
                        stack.push(newString.charAt(m));// 3
                    }

                } else {
                    stack.push(s.charAt(i));//  1 0 
                }
            }
            StringBuilder result = new StringBuilder();
            while(!stack.isEmpty()){
                result.insert(0, stack.pop());
            }

            return result.toString();

    }
   
}