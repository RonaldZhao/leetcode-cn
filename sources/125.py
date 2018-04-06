class Solution:
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if s == "":
            return True
        s1 = "" # 构建一个s的纯小写字母或数字组成的正序字符串
        s2 = "" # 构建一个s的纯小写字母或数字组成的反序字符串
        for c in s:
            if c in string.ascii_letters or c in string.digits:
                s1 += c.lower() # 全部转化为小写，数字转后还是数字，正序
                s2 = c.lower() + s2 # 反序
        return s1 == s2
