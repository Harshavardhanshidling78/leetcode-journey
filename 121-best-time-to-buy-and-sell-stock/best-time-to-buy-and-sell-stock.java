class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy_price = prices[0];
        int curr_profit = 0;
        int max_profit = 0,i;
        for(i=1;i<n;i++){
            curr_profit = prices[i] - buy_price;
            if(max_profit < curr_profit){
                max_profit = curr_profit;
            }
            if(prices[i] < buy_price){
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
}