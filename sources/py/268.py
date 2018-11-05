class Solution:
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 变态测试例子:
        # [0]
        # [1]
        # [0,1]
        if len(nums) == 1:
            if nums[0] == 1:
                return 0
            return nums[0]+1  # 不知道为什么，测试初来的，这个题就是这么恶心
        nums.sort()
        if nums[0] != 0:
            return 0
        for i in range(1, nums[-1]):
            if nums[i] - nums[i-1] != 1:
                return nums[i]-1
        return nums[-1]+1  # 缺少最大的那个数
