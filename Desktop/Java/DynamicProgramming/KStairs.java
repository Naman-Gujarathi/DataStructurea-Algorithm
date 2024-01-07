package DynamicProgramming;
import java.util.*;;

public class KStairs {

 int minEnergy( int []energyLevelStairs, int topStair, int k, int result, int[] dp ) {

        if(dp[topStair] != -1) {
            return dp[topStair];
        }

        if(topStair == 0) {
            return dp[topStair] = 0;
        }

        // if(topStair == 1) {
        //     return dp[topStair] = Math.abs(energyLevelStairs[1]-energyLevelStairs[0]) ;
        // }

        
        for(int i =1; i<=k; i++) {
            if(topStair-i>=0) {
                int currentEnergy = minEnergy(energyLevelStairs, topStair - i,  k, result, dp) + Math.abs(energyLevelStairs[topStair] - energyLevelStairs[topStair-i]);
                result = Math.min(currentEnergy, result); 
            }
           
        }

        return dp[topStair] =result;
        

    }
    




    public static void main(String args[]) {

        KStairs obj = new KStairs();
        int energyLevelStairs[] ={10,20,30,10};
        int dp[] = new int[energyLevelStairs.length];
        Arrays.fill( dp, -1);
        int k = 1;
        int topStair = energyLevelStairs.length-1;
        // int []energy = new int[1];
        int result = Integer.MAX_VALUE;
        int minEnergy = obj.minEnergy(energyLevelStairs,topStair, k, result, dp );
        System.out.println("minEnergy " + minEnergy);
    }
}
