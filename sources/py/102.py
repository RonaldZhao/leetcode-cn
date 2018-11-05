# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        """
        利用队列解决
        """
        if not root:
            return []
        elif not root.left and not root.right:
            return [[root.val]]
        else:
            import queue
            q = queue.Queue()
            result = []
            q.put(root)
            while not q.empty():
                cur_level = []
                qsize = q.qsize()
                i = 0
                while i < qsize:
                    cur_node = q.get()
                    cur_level.append(cur_node.val)
                    if cur_node.left:
                        q.put(cur_node.left)
                    if cur_node.right:
                        q.put(cur_node.right)
                    i += 1
                result.append(cur_level)
            return result
