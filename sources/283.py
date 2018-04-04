class Solution:
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        for i in range(nums.count(0)): # 遍历count(0)次
            nums.remove(0) # 从前向后移除0
            nums.append(0) # 然后追加在最后
