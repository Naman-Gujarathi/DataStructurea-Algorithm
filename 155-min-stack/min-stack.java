class Pair {
    int element;
    int min;
    public Pair(int element, int min){
        this.element = element;
        this.min = min;
    }
}


class MinStack {
    Stack<Pair> minstack;
     Pair pair;
     int smallest; 

    public MinStack() {
        minstack = new Stack<>();
        smallest = Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {

        smallest =  Math.min(val, smallest);
        minstack.push(new Pair(val, smallest));
    }
    
    public void pop() {
        minstack.pop();
        if(!minstack.isEmpty()){
            smallest = minstack.peek().min;
        } else{
            smallest = Integer.MAX_VALUE;
        }
         
        
    }
    
    public int top() {
       return minstack.peek().element;
    }
    
    public int getMin() {
       return minstack.peek().min; 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */