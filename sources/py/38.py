class Solution:
    # 执行用时：56ms
    def f(self, cur_str, cur_n, target_n):
        if cur_n < target_n:
            s = ""
            n = 1
            cur_str_len = len(cur_str)
            for i in range(1,cur_str_len):
                if cur_str[i] == cur_str[i-1]:
                    n += 1
                else:
                    s += str(n)+cur_str[i-1]
                    n = 1
            s += str(n)+cur_str[cur_str_len-1]
            return self.f(s, cur_n+1, target_n) # 递归
        return cur_str
        
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        # 连续相同的要组在一起读，如1111读为41
        if n <= 0:
            return "1" # 由测试得
        else:
            return self.f("1", 1, n)
