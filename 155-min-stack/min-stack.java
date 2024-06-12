class Node{
     int value;
     int min;
     Node next;
 
     public Node(int value, int min){
        this.value = value;
        this.min = min;
        this.next = null;
     }
    }
 
 
class MinStack {
    Node head;
    int currentMin;
    public MinStack() {
       currentMin = Integer.MAX_VALUE;
 
        
    }
    public void push(int val) {
        currentMin = Math.min(val, currentMin);
 
         Node temp = new Node(val, currentMin);
         if(head == null){
              head = temp;
         } else {
            temp.next = head;
            head = temp;
         }

    }
    public void pop() {
              if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        head = head.next;
        if (head != null) {
            currentMin = head.min;
        } else {
            currentMin = Integer.MAX_VALUE;
        }
         
    }
    public int top() {
        //      if (head == null) {
        //     throw new IllegalStateException("Stack is empty");
        // }
        return head.value;
        
    }
    public int getMin() {
        //       if (head == null) {
        //     throw new IllegalStateException("Stack is empty");
        // }
        return head.min;
        
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */