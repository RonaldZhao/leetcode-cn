class Solution:
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # 使用list模拟栈操作
        if len(s) == 1 or len(s) % 2 == 1:
            return False
        stack = []
        for c in s:
            if c in '([{':  # 左括号进栈
                stack.append(c)
            elif len(stack) == 0:  # 碰到了右括号但是栈已经空了
                return False
            elif c == ')':
                if stack.pop() != '(':
                    return False
            elif c == ']':
                if stack.pop() != '[':
                    return False
            else:
                if stack.pop() != '{':
                    return False
        if len(stack) > 0:  # 剩余栈不为空
            return False
        return True
