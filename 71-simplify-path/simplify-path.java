class Solution {
    public String simplifyPath(String path) {
        // create Stack to pop up when .. condition comes
        Stack<String> stack = new Stack<>();
        // to get string array // will become "" and /./ will become .
        String str[] = path.split("/"); // split for "/"
        for(int i=0; i<str.length; i++){
            if(str[i].equals(".")){ 
                continue;
            }
            else if(str[i].equals("")){
                continue;
            }
            else if(str[i].equals("..")){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
               
            }
            else {
                stack.push(str[i]);
            }
        }

        System.out.println("stack " + stack);
        String result = "";
        // to make sure that I get result in correct order not reverse order
        while(!stack.isEmpty()) {
           result = "/" + stack.pop() + result;  // append result in last so that pop will be on front of string
        }

        return result.equals("") ? "/" : result;

    }
}