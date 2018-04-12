class Solution:
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        # 只需要判断所走的方向是否是成对的即可
        right = moves.count("R")
        left = moves.count("L")
        up = moves.count("U")
        down = moves.count("D")
        if left == right and up == down:
            return True
        return False
