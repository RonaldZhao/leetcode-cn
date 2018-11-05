# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if not l1:
            return l2
        elif not l2:
            return l1
        elif l1.val <= l2.val:  # 使新链表的头结点为两个链表的第一个结点的val小的那个
            head = l1
            l1 = l1.next
        else:
            head = l2
            l2 = l2.next
        index = head
        while l1 and l2:
            if l1.val <= l2.val:  # 寻找值较小的加入新链表
                index.next = l1
                l1 = l1.next
            else:
                index.next = l2
                l2 = l2.next
            index = index.next
        while l1:  # 如果l1还有结点则将l1的剩余结点加入新链表
            index.next = l1
            l1 = l1.next
            index = index.next
        while l2:  # 如果l2还有结点则将l2的剩余结点加入新链表
            index.next = l2
            l2 = l2.next
            index = index.next
        return head
            
