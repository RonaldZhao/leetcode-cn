class Solution:
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # 一开始没搞清楚题意，模棱两可的题目描述真可怕
        # 题意是说判断给定的两个字符串是否包含相同的字母并且每个字母出现的次数都一样（只是位置不同）
        len_s, len_t = len(s), len(t)
        if len_s != len_t: # 长度不同直接返回False
            return False
        if len_s <= 1:
            return s == t
        set_s, set_t = set(s), set(t)
        if len(set_s) != len(set_t) or set_s != set_t:
            return False
        dict_s = {}
        for c in set_s:
            dict_s[c] = s.count(c)
        dict_t = {}
        for c in set_t:
            dict_t[c] = t.count(c)
        return dict_s == dict_t # 直接判断两个字典是否相同，即是否有相同的字母和对应次数相同
