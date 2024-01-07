package DynamicProgramming;
import java.util.*;

public class ClimbingStairsI {

    int  minEnergyLost (int []stairLevelEnergy, int height, int EnergyLost, int minPathEnergy, int dp[]) {

        if(height ==0) {

         
            // System.out.println("Energy Lost" + EnergyLost);
             minPathEnergy = Math.min(EnergyLost, minPathEnergy );
            //  System.out.println("min Path Energy Lost" + minPathEnergy);
             

            return minPathEnergy ;
        }

        if(dp[height] != -1) {

            System.out.println("height " + height + "dp value " + dp[height]);

            return dp[height];
        }

        int currentEnergyLost = Math.abs(stairLevelEnergy[height] - stairLevelEnergy[height-1]) ;

        int energy = minEnergyLost(stairLevelEnergy, height-1, currentEnergyLost + EnergyLost, minPathEnergy, dp);

        if(height >1) {

        currentEnergyLost = Math.abs(stairLevelEnergy[height] - stairLevelEnergy[height-2]) ;

        int energyI = minEnergyLost(stairLevelEnergy, height-2, currentEnergyLost + EnergyLost, minPathEnergy, dp);

        System.out.println("height " + height + "dp value " + dp[height] + "energy" + energy + "energyI" + energyI);
        return dp [height] = Math.min(energy, energyI);
        }

        System.out.println("height " + height + "dp value " + dp[height] + "energy" + energy);
        return dp[height] = energy;


    }


    public static void main (String args[]) {

        ClimbingStairsI obj = new ClimbingStairsI();
        int stairLevelEnergy[] = {10, 20, 30, 10};
        int height = stairLevelEnergy.length-1;
        int dp[] = new int[height + 1];
        Arrays.fill(dp, -1);
        int EnergyLost =0;
        int minPathEnergy = Integer.MAX_VALUE;
        int energyLost =obj.minEnergyLost(stairLevelEnergy, height, EnergyLost, minPathEnergy, dp );
        System.out.println("energyLost " + energyLost);
        
        
    }
    
}
