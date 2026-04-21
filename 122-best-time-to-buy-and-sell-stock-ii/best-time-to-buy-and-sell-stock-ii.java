class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice;
        int profit = 0;
        int i;
        for(i=1;i<n;i++){
            buyPrice = prices[i-1];
            if(buyPrice < prices[i]){ 
                profit += prices[i] - buyPrice;
            }

        }
        return profit;
    }
}