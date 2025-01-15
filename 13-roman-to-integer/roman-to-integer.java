class Solution {
    public int romanToInt(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // map.put('I', 1);
        // map.put('V', 5);
        // map.put('X', 10);
        // map.put('L', 50);
        // map.put('C', 100);
        // map.put('D', 500);
        // map.put('M', 1000);



        int result = 0;
        for(int i=0; i<s.length()-1; i++){
            if( get(s.charAt(i)) >=  get(s.charAt(i +1))){
                result += get(s.charAt(i));
            }else{
                result -= get(s.charAt(i));
            }
        }

        result = result + get(s.charAt(s.length()-1));
        return result;

    }

   int get(char character){
        switch(character){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
            
        }
    }
}


// XMLC

// -100 + 1000 + -50 + 100