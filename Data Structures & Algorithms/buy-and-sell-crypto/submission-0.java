class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0, profit=0;
        for(int i=0; i<prices.length;i++) {
            int left = i, right = prices.length-1;
            while(left<right) {
                profit = prices[right] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
                right--;
            }
        }
        return maxProfit;
    }
}
