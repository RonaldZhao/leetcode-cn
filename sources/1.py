class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            x = target - nums[i] # 求与目标值的差值
            if nums[i+1:].count(x) >= 1: # 如果后面存在
                return [i, nums[i+1:].index(x)+i+1]
            elif nums[:i].count(x) >= 1: # 如果前面存在
                return [nums.index(x), i]

