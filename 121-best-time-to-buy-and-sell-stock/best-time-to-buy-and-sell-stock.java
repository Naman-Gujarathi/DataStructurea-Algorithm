class Solution {
    public int maxProfit(int[] prices) {
        
      int buy = Integer.MAX_VALUE;
      int currentProfit = 0;
      int maxProfit = 0;
      for(int price : prices){
         buy = Math.min(buy, price);
         currentProfit = price - buy;
         maxProfit = Math.max(currentProfit, maxProfit);
      }
      return maxProfit;
    }
}
    






    
 