class Stack {

    int array[];
    int count;
    int capacity;

    public Stack() {
        
        count=0;
        capacity=10;
        array = new int[capacity];
    }

   void  push (int element) {
    if(count ==capacity) {
        System.out.println("Stack is Overflow");
    }
    array[count]= element;
    count++;
   }

   void pop() {
        if(count>0){
        
        count--;
        }
        else{
            System.out.println("Stack is Underflow");
        }
   }

   int size() {
    return count;

   }

   int peek() {
    if (count>0) {
        return array[count-1];
    }
    return -1;
   }


}




public class ArrayStack {
  public static void main (String args[]) {
    Stack obj = new Stack();
    obj.push(1);
    obj.push(2);
    obj.push(3);
    obj.pop();
    
    System.out.println("Top element: " + obj.peek());
    System.out.println("Stack size: " + obj.size());
  }
 



    
}
