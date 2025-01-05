class Pair{
    char character;
    int freq;

    public Pair(char character, int freq){
        this.character = character;
        this.freq = freq;
    }
}

class Solution {
    public String reorganizeString(String s) {

        // edge case 
        if(s == null  || s.length() == 0){
            return s;
        }

        // int count = 0;
        // Queue<Character> queue = new LinkedList<>();
        // StringBuffer sb = new StringBuffer();
        // char arr[] = s.toCharArray();
        // for(int i=0; i<arr.length; i++){
        //     queue.add(arr[i]);
        // }
        
        // sb.append(queue.poll());

        // while(!queue.isEmpty()) {
           
        //     if(queue.peek() != sb.charAt(sb.length()-1)){
        //         sb.append(queue.poll());
        //         count = 0;
        //     }else{
        //         char poppedChar = queue.poll();
        //         queue.add(poppedChar);
        //         count++;
        //         if(count + sb.length() == s.length()){
        //             return "";
        //         }
        //     }
        // }

        // return sb.toString();
        
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> (b.freq - a.freq));
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > (s.length() + 1)/2){
                return "";
            }
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        // System.out.println("pq" + pq);
        Pair poppedPair = pq.poll();
        sb.append(poppedPair.character);
        if(poppedPair.freq > 1){
                  pq.add(new Pair(poppedPair.character, poppedPair.freq-1));
            }


        while(!pq.isEmpty()){
            Pair firstHightest = pq.poll();
            // if(pq.isEmpty()){
            //     if((firstHightest.freq == 1) && (firstHightest.character != sb.charAt(sb.length()-1))){
            //         continue;
            //     }
            //     else if((firstHightest.freq == 1) && (firstHightest.character == sb.charAt(sb.length()-1))){
            //         return "";
            //     }
            //     else if(firstHightest.freq > 1){
            //         return "";
            //     }
            // }

            if(firstHightest.character == sb.charAt(sb.length()-1) && (!pq.isEmpty())){
                Pair secondHightest = pq.poll();
                sb.append(secondHightest.character);
                if(secondHightest.freq > 1){
                  pq.add(new Pair(secondHightest.character, secondHightest.freq-1));
                }
                pq.add(firstHightest);
            }else{

                sb.append(firstHightest.character);
                if(firstHightest.freq > 1){
                pq.add(new Pair(firstHightest.character, firstHightest.freq-1));
                }
            }
            
        }


        return sb.toString();




        


    }
}