class Solution {
    public String smallestNumber(String pattern) {
        int arr[] = new int[pattern.length()+1];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
       
        for(int i=1; i<arr.length; i++){
     
           if(i-1 < pattern.length() && pattern.charAt(i-1) == 'D' && arr[i] > arr[i-1]) {
             int start = i-1;
             int end = i-1;
            //  int count =0;
             while(end < pattern.length() && pattern.charAt(end ) == 'D'){
                end++;
             }
            //  end = end-1;
             if(start < end){
                  reverse(arr, start, end);
             }
           

           }
        }

       
        

        for(int val : arr) {
            System.out.print(val);
            sb.append(val);
        }

        return sb.toString();
       
    }

     void reverse(int arr[], int start, int end){
            while(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
               arr[end] = temp;
               start++;
               end--;
            }
            
     }
}



