class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> stack = new Stack<>(); 
        int result = 0;
        int val1 =0;
        int val2=0;
         for(int i=0; i<tokens.length; i++){
             switch(tokens[i]) {
                case "+": 
                   val1 = stack.pop();
                   if(!stack.isEmpty()) {
                     val2 = stack.pop();
                   
                   }
                   
                   result = val1 + val2;
                   stack.push(result);
                   break;

                case "-": 
                   val1 = stack.pop();
                   if(!stack.isEmpty()) {
                     val2 = stack.pop();
                   }
                   result =  val2 - val1;
                   stack.push(result); 
                    break;

                case "*":
                   val1 = stack.pop();
                   if(!stack.isEmpty()) {
                     val2 = stack.pop();
                   }
                   result =  val2 * val1;
                   stack.push(result);
                    break; 

                case "/": 
                   val1 = stack.pop();
                   if(!stack.isEmpty()) {
                     val2 = stack.pop();
                   }
                   result =  val2 / val1;
                   stack.push(result);
                   break; 

                default: 
                    int val = Integer.parseInt(tokens[i]);
                    stack.push(val);
                    break;    
            }    
        }


        return result;
    }
}