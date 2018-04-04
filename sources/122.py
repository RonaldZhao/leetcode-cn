class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if prices is None or len(prices) < 2:
            return 0
        profit = 0
        minV = prices[0]
        for p in prices:
            if p > minV: # 只要有利润
                profit += p - minV # 则不断累加利润差值
                minV = p # 同时更新当前的最低买入价
            elif p < minV: # 如果遇到更低价格
                minV = p # 则以更低价格买入
        return profit
