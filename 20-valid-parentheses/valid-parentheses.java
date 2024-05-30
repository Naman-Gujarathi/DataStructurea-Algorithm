class Solution {
    public boolean isValid(String s) {
     
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[' ) {
                stack.push(s.charAt(i));
            }
            else {
                Character pairChar = map.get(s.charAt(i));
                if(stack.isEmpty() || stack.peek() != pairChar ) {
                    return false;
                }
                else if(stack.peek() == pairChar) {
                    stack.pop();
                }
               
            }

           
        }
             return stack.isEmpty();
    }
}


