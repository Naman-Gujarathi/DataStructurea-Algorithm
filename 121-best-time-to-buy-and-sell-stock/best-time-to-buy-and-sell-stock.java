class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int currProfit = Integer.MIN_VALUE;
        int maxProfit =  0;
        for(int i=1; i<=prices.length-1; i++){
            currProfit = prices[i] - buy;
            maxProfit = Math.max(currProfit, maxProfit);
            buy = Math.min(buy, prices[i]);
        }

        return maxProfit;
    }
}