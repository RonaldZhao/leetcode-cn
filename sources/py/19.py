# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # 因为给定的 n 始终是有效的，所以不考虑 n 无效的情况
        # 思路，以 n 为步长遍历链表的每个结点，当某个结点后面的第 n 个结点是 None 的时候就找到了
        curNode = prevNode = head
        while True:
            tempNode = curNode
            i = 1
            while i <= n:
                if tempNode == None: # 给定 n 大于链表长度
                    return head.next
                tempNode = tempNode.next
                i += 1
            if tempNode == None: # 找到了
                if prevNode == curNode: # 如果是头结点
                    if prevNode.next == None: # 如果只有一个头结点
                        head = None
                    else:
                        head = head.next
                else:
                    prevNode.next = curNode.next
                break
            else:
                prevNode = curNode
                curNode = curNode.next
        return head
