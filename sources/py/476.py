class Solution:
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        s = bin(num)[2:]
        s2 = ""
        for i in range(len(s)):
            if s[i] == "0":
                s2 += "1"
            else:
                s2 += "0"
        return int(s2, 2)
