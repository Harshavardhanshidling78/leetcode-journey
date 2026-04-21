class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = prices[0];
        int currProfit = 0;
        int maxProfit = 0,i;
        for(i=1;i<n;i++){
            currProfit = prices[i] - buyPrice;
            if(maxProfit < currProfit){
                maxProfit = currProfit;
            }
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}