class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // 3 3 *
      
        int result = 0;
        int val1 =0;
        int val2=0;
         for(int i=0; i<tokens.length; i++){
        
              if(tokens[i].equals("+")  || tokens[i].equals("-")  ||  tokens[i].equals("*") || tokens[i].equals("/")) {
             
                       val1 = stack.pop();
                   if(!stack.isEmpty()){
                       val2 = stack.pop();
                   }
                  
                   if(tokens[i].equals("+")){
                        result = val1 + val2;
                    
                        stack.push(result); 
                   }
                   else if(tokens[i].equals("-")){
                      result =  val2 - val1;
                       stack.push(result); 
                   }
                   else if(tokens[i].equals("*")){
                         result =  val2 * val1;
                          stack.push(result); 
                   }else{
                     if(val1 != 0){
                         result = val2 / val1;
                         stack.push(result);  
                     }
                    
                   }
              } else {
                int value = Integer.parseInt(tokens[i]);
                stack.push(value); // 2 1
                 
              }
         }

        return stack.pop();
    }
}