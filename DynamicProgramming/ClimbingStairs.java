package DynamicProgramming;

import java.util.*;

// public class ClimbingStairs {

//     function ( int index, int requiredSum) {

//         if(requiredSum== 0) {

//             return 1;

//         }

//         if(requiredSum >1)
//         function (index+2,requiredSum-2) ;
        
//         function( index+1, requiredSum-1);



//     }

//     public static void main (String args[]){

//         ClimbingStairs obj = new ClimbingStairs();
//         // int n=10;
//         int index=0;
//         int requiredSum = 10;
//         obj.function( index, requiredSum  );
    
    
// }


public class ClimbingStairs {

    int count (int stairLevel,  List<Integer> list, List<List<Integer>> returnList) {

        // if(dp[stairLevel] != -1) {

        //     if(stairLevel ==0) {
        //     returnList.add(new ArrayList<>(list));
        //     }
           
        //     return dp[stairLevel];
        // }
        
        if (stairLevel == 0  ){

            returnList.add(new ArrayList<>(list));
            
            return  1;        
        }

        
        list.add(1);
        
        int left = count (stairLevel -1,  list, returnList);

        list.remove(list.size()-1);

        if( stairLevel > 1) {

            list.add(2);
        
            int right = count (stairLevel -2,  list, returnList);

            list.remove(list.size()-1);
            
            return  left + right;


        }

        return  left;



       

    }


    public static void main (String args[]) {

        ClimbingStairs obj = new ClimbingStairs();
        Scanner sc = new Scanner(System.in);
       
        System.out.println("find out number of ways for");
        int stairLevel = sc.nextInt();
        // int dp[] = new int[stairLevel+1];
        // Arrays.fill(dp, -1);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> returnList = new ArrayList<>();
        int values = obj.count(stairLevel, list, returnList);
        System.out.println(values);
        System.out.println("returnList" + returnList);
    }
}