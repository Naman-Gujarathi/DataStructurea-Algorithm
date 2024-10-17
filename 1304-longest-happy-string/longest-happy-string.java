
class Pair{
    Character character;
    int value;

    public Pair(Character character, int value){
        this.character = character;
        this.value = value;
    }
}    

class Solution {
    public String longestDiverseString(int a, int b, int c) {

        if( (a > 2 && b ==0 && c ==0) && (b > 2 && c ==0 && a == 0) && (c > 2 && b ==0 && a == 0)){
            return "";
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>((a1,b1) -> {
            return b1.value - a1.value;
            });

        if(a > 0){
            queue.add(new Pair('a', a));
        }
        
        if(b > 0){
            queue.add(new Pair('b', b));
        }
        
        if(c > 0){
             queue.add(new Pair('c', c));
        }
       

        StringBuffer sb = new StringBuffer();
        while(!queue.isEmpty()){
            if(sb.length() >= 2){
                Pair poppedObj = queue.poll();
                
                if(sb.charAt(sb.length()-1) == poppedObj.character && sb.charAt(sb.length()-2) == poppedObj.character){
                    if(queue.isEmpty()){
                        break;
                    }
                     Pair nextPoppedObj = queue.poll();
                     sb.append(nextPoppedObj.character);
                     nextPoppedObj.value = nextPoppedObj.value -1;
                     if(nextPoppedObj.value > 0){
                        queue.add(new Pair(nextPoppedObj.character, nextPoppedObj.value));
                     }

                      queue.add(new Pair(poppedObj.character, poppedObj.value));
                }
                else{
                    sb.append(poppedObj.character);
                    poppedObj.value = poppedObj.value -1;
                    if(poppedObj.value > 0){
                        queue.add(new Pair(poppedObj.character, poppedObj.value));
                     }
                }
            }
            else{
                Pair poppedObj = queue.poll();
                sb.append(poppedObj.character);
                poppedObj.value = poppedObj.value -1;
                if(poppedObj.value > 0){
                    queue.add(new Pair(poppedObj.character, poppedObj.value));
                }
            }


        }

        return sb.toString();



    }
}





// if(a >= 3 and b=0 and c=0) return ""

// if a> (b,c)
// if (b+c > a) decremtb by 2

// else decrement by 1

// if b=0 and c= 0 and a>= 3 consider a only 2 times

