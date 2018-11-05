class Solution:
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        # 坑多，细心
        if nums is None or len(nums) <= 1 or k is None or k == 0:
            return
        if k > len(nums):
            k = k % len(nums)
        # nums = nums[-k:] + nums[:k] # 这种方式会是nums重新赋值，地址会变
        # 可以使用如下方式，注意区别
        nums[:] = nums[-k:] + nums[:-k]
        # 也可以使用如下方式
        """
        temp = nums[:-k]
        nums[:k] = nums[-k:]
        nums[k:] = temp
        """
