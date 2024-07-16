class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) { 
     int c =0, r=0, o=0, a=0, k=0;
     int currentFrog =0;
     int minFrogs =0;
     for(char ch : croakOfFrogs.toCharArray()){
        switch(ch) {
            case 'c':
                c++;
                currentFrog++;
                break;
            case 'r':
                r++;
                break;
            case 'o':
                o++;
                break;
            case 'a':
                a++;
                break;
            case 'k':
                k++;
                currentFrog--;
                break;
        }

        if(c<r || r<o || o<a || a<k){
            return -1;
        } 

        minFrogs = Math.max(minFrogs, currentFrog);
    }
     return currentFrog == 0 ? minFrogs : -1;

  }

}