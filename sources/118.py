class Solution:
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        # 第n行有n个元素，且第一个和最后一个一定是1
        if numRows == 0:
            return []
        if numRows == 1:
            return [[1]]
        else:
            result = [[1]]
            for i in range(1,numRows):
                result.append([1,1])
            for j in range(2, numRows):
                # 不断在每行的倒数第二个位置插入新值
                for k in range(1, j):
                    result[j].insert(-1, result[j-1][k-1] + result[j-1][k])
            return result
