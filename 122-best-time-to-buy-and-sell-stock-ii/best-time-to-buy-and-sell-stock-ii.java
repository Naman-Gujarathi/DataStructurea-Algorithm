class Solution {
    public int maxProfit(int[] prices) {
        int currProfit = 0;
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                currProfit = prices[i] - prices[i-1];
                maxProfit += currProfit;
            }
        }

        return maxProfit;
    }
}