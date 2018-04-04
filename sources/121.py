class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        # 思路：由于只能完成一次交易：即只能有一次买入和一次卖出，所以题目也就是求给定数组中的某两个元素的最大差值
        if prices is None or len(prices) < 2:
            return 0
        profit = 0
        # 暴力法, 时间复杂度：O(n^2)
        """
        for i in range(len(prices)-1):
            for j in range(i+1, len(prices)):
                profit = max(profit, prices[j] - prices[i])
        """
        # 动态规划，选取最小的价格购买，保留最大的利益，只需遍历一次，时间复杂度：O(n)
        minV = prices[0]
        for p in prices:
            profit = max(profit, p-minV)
            minV = min(p, minV)
        return profit
