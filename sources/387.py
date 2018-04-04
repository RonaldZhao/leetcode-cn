class Solution:
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        # 方法一：性能164ms
        """
        s2 = {}
        for c in s:
            if c in s2:
                s2[c] += 1
            else:
                s2[c] = 1
        for i in range(len(s)):
            if s2[s[i]] == 1:
                return i
        return -1
        """
        # 方法二：性能68ms
        return min([s.find(c) for c in string.ascii_lowercase if s.count(c) == 1] or [-1])
