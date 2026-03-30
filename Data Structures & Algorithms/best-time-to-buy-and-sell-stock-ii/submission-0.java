class Solution {
    public int maxProfit(int[] prices) {
        int p1=0;
        int profit=0;
        for(int p2=1;p2<prices.length;p2++){
            if(prices[p2]<prices[p1]){
                p1=p2;
            }else{
                profit+=prices[p2]-prices[p1];
                p1++;
            }
        }
        return profit;
    }
}