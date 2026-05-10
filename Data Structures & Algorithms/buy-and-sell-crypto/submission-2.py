class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprice=0
        sell=prices[0]
        for price in prices:
            if sell>price:
                sell=price
            maxprice=max(maxprice, price-sell)
        return maxprice
            