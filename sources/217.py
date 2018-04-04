class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if nums is None or len(nums) < 2: # 由于是同一个元素至少两次，所以少于两个元素的情况直接返回False
            return False
        return len(nums) != len(set(nums))
