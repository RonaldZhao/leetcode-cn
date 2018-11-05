class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 思路：如果列表长度为1则直接返回此元素，否则使用异或操作，因为4^5^4==4^4^5==5，所以与做异或的顺序无关
        if len(nums) == 1:
            return nums[0]
        for i in range(1, len(nums)):
            nums[0] = nums[0] ^ nums[i] # 保存在nums[0]中则可以不使用额外空间
        return nums[0]
