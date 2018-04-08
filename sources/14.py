class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if strs is None or len(strs) == 0:
            return ""
        elif len(strs) == 1:
            return strs[0]
        else:
            for i in range(len(strs)):
                strs[i] = list(strs[i])
            strs = zip(*strs
            ss = ""
            for s in strs:
                if len(set(s)) == 1:
                    ss += s[0]
                else:
                    break
            return ss
