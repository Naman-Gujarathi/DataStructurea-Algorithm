class ArrayList<T> {

 private int count;
Object array[];
 private int capacity;


  public ArrayList() {
    count =0;
    capacity=10;
    array = new Object[capacity];
  }

  void add (T element) {
    if(count == capacity) {
        Object newArray[] = new Object[capacity*2];
        for (int i=0; i<capacity; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        capacity=capacity*2;
    }
    array[count]=element;
    count++;  

  }

  T get (int index){
   if(index>=0 && index<count) {
    return (T) array[index];
   }
  return null;
    

  }

  void remove (int index) {
     for(int i=index; i<count-1; i++){
        array[i] = array[i+1];
     }
     count--;

  }

  int size () {
    return count;
  }


}


public class Solution {

  public static void main (String args[]){

        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.get(2);// index 2
        obj.size();
        obj.remove(3);// index 3

  }


}
