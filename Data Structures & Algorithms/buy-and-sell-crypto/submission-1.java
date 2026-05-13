class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++){
            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxProfit;
        
    }
}
