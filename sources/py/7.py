class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0
        elif x < 0:
            x = -int(str(-x)[::-1].lstrip("0"))
            if x < -2**31:
                return 0
            return x
        else:
            x = int(str(x)[::-1].lstrip("0"))
            if x > 2**31-1:
                return 0
            return x
