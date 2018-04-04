class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        # 我觉得这道题描述的不够严谨，试试[9,9,9]就能看出来
        # 此解法也仅仅是在承认这道题的不严谨的基础上的解法
        n=digits[0]
        for i in range(1, len(digits)):
            n = n*10+digits[i]
        n += 1
        result = []
        [result.append(int(i)) for i in str(n)]
        return result
