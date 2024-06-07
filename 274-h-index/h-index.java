class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); //  1 2 3 4 5
        int count =0;
        boolean flag = false;
        int hIndexValue = citations.length;// 5
        // 0  1 2
        // 4 -> 0
        for(int i = citations.length -1; i>=0; i--){
             if(count == hIndexValue){//  1 == 2
                break;
            }
           
            while(citations[i] < hIndexValue){ // 
                hIndexValue--; // 

                if(count == hIndexValue){//  1 == 2
                   flag = true;
                   break;
                }
            }

             if(flag == true){
                break;
            }

            if(citations[i] >= hIndexValue){ // 5 5
                count++; // 1
            }

            

           
        }

        return hIndexValue;
    }
}