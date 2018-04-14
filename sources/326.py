class Solution:
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        # 首先分析3的幂的特点: 假设一个数Num是3的幂，那么所有Num的约数都是3的幂
        # 如果一个数n小于Num且是3的幂，那么这个数n一定是Num的约数
        if n < 1:
            return False
        maxPower = int(math.pow(3,int((math.log(0x7fffffff)/math.log(3)))))  # 0x7fffffff是int型最大值
        return maxPower % n == 0
