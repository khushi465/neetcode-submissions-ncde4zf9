class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprice=0
        minBuy=prices[0]
        for sell in prices:
            if minBuy>sell:
                minBuy=sell
            maxprice=max(maxprice, sell-minBuy)
        return maxprice
            