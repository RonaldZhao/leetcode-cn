# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next: # 链表为空或只有一个结点
            return head
        prev = head # 记录前一个结点
        index = head.next # 当前头结点
        prev.next = None # 脱离第一个结点
        while index: # 只要还有结点就循环遍历
            head = index # 更新头结点
            next_node = index.next # 临时获取下一个结点
            head.next = prev # 将新头结点指向目标链表
            prev = head # 更新前一个结点
            index = next_node # 更新当前头结点
        return head
