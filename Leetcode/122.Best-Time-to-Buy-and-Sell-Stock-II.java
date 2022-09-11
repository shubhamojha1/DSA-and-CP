class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = -1 , maxProfit = 0;
        int l = prices.length;
        for(int i=1;i<l;i++){
            int x=prices[i]-prices[i-1];
            if(x>0)
                maxProfit+=x;
        }
        return maxProfit;
    }
}
// Find changes, if change>0 ie there is a chance for profit, add to maxProfit
