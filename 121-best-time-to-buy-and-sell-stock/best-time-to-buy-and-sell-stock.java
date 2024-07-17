class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        int currProfit = 0;
        for(int price : prices){
            currProfit = price - buy;
            maxProfit = Math.max(maxProfit, currProfit);
            buy = Math.min(buy, price);
        }

        return maxProfit >= 0 ? maxProfit : 0;
    }
}