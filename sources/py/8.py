class Solution:
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        # 等正则学好了再改进
        # 典型测试用例
        # "+-2"
        # "     +0000123123a211"
        # ""
        # "-2147483649"
        # "2147483648"
        # "+0"
        # "1a"
        str = str.strip()
        if str == "":
            return 0
        elif len(str) == 1:
            if str.isdigit():
                return int(str)
            else:
                return 0
        elif str[0].isdigit() or ((str[0] == "-" or str[0] == "+") and str[1].isdigit()):
            n = str[0]
            i = 1
            c = str[i]
            while c.isdigit():
                n += c
                i += 1
                if i >= len(str):
                    break
                c = str[i]
            n = int(n)
            if n < -2147483648:
                return -2147483648
            elif n > 2147483647:
                return 2147483647
            else:
                return n
        return 0
