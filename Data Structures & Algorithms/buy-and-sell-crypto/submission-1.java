class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit=0, profit=0;
        // for(int i=0;i<prices.length-1;i++){
        //     for(int j=prices.length-1;j>i;j--){
        //         profit=prices[j]-prices[i];
        //         maxProfit=Math.max(profit, maxProfit);
        //         System.out.println(maxProfit);
        //     }
        // }
        // return maxProfit;
        // int l=0, r=1;
        // while(r<prices.length){
        //     if(prices[l]<prices[r]){
        //         profit=prices[r]-prices[l];
        //         maxProfit=Math.max(maxProfit, profit);}
        //         else{

        //         l=r;
        //     }
        //     r++;
        // }
        // return maxProfit;

        int minBuy=prices[0], maxProfit=0;
        for(int sell:prices){
            maxProfit=Math.max(maxProfit, sell-minBuy);
            minBuy=Math.min(minBuy, sell);
        }
        return maxProfit;
    }
}
