class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int remainder = -1;
        int quotient = -1;
        int currentSum =0;// 19
        while(n != 1){
            if(!map.containsKey(n)){
                quotient = n;
                while( quotient!=0){ // 19
                    remainder = quotient %10; //1
                    quotient = quotient/10;// 0
                    currentSum = currentSum + (remainder*remainder); 
                  
            
                }   
                    map.put(n, currentSum);// 19, 81
                    // System.out.println("map" + map);
                    n = currentSum; // 81
                    currentSum =0;

                }
                else {
                    return false;
                  }   

        }
            return true;

    }
}