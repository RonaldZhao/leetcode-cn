class Solution:
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        result = []
        for n in nums1:
            if n in nums2:
                nums2.remove(n) # 防止num1中有的元素出现次数多于在nums2出现的次数的情况
                result.append(n)
        return result
