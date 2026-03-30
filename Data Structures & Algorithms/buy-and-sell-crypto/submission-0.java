class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0, profit=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=prices.length-1;j>i;j--){
                profit=prices[j]-prices[i];
                maxProfit=Math.max(profit, maxProfit);
                System.out.println(maxProfit);
            }
        }
        return maxProfit;
    }
}
