class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit=0;
        int minprofit=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            minprofit=Math.min(prices[i],minprofit);
            int profit=prices[i]-minprofit;
            maxprofit=Math.max(profit,maxprofit);
               
        }
         return maxprofit;
    }
}