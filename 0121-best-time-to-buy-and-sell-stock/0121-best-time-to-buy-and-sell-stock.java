class Solution { 
    public int maxProfit(int[] prices) { 
        int minPrice = Integer.MAX_VALUE;  //buy
        int maxProfit = Integer.MIN_VALUE; //profit till now
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice) minPrice = prices[i];

            profit = prices[i] - minPrice;
            if(maxProfit < profit){
                maxProfit = profit;
            }
        } 

        return maxProfit;
    } 
} 