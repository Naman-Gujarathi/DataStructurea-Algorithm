class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int remainder = -1;
        int quotient = -1;
        int currentSum =0;// 19
        while(n != 1){
            
            //  System.out.println("set " + set);
           
            if(!set.contains(n)){
                set.add(n);
                quotient = n;
                while( quotient!=0){ // 19
                    remainder = quotient %10; //1
                    quotient = quotient/10;// 0
                    currentSum = currentSum + (remainder*remainder); 
                  
                }   
                    
                    // System.out.println("set " + set);// 19, 81
                    // System.out.println("map" + map);
                    n = currentSum; // 82
                    currentSum =0;

                }
                else {
                    return false;
                  }   

        }
        
            return true;

    }
}