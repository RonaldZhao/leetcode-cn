class Solution:
    """
    :type board: List[List[str]]
    :type x: int
    :type y: int
    :rtype bool
    """
    def checkSub(self, board, x, y): # 验证子数独
        li = []
        for i in range(x,x+3):
            for j in range(y,y+3):
                li.append(board[i][j])
        for k in range(1,10):
            if li.count(str(k)) > 1:
                return False
        return True
    
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        for row in range(9): # 判断每一行
            for col in range(9):
                if board[row].count(str(col+1)) > 1:
                    return False
        for col in range(9): # 判断每一列
            temp = []
            for row in range(9):
                temp.append(board[row][col])
            for n in range(1, 10):
                if temp.count(str(n)) > 1:
                    return False
        for x in range(0,9,3):
            temp = []
            for y in range(0,9,3):
                if self.checkSub(board, x,y) == False:
                    return False
        return True
