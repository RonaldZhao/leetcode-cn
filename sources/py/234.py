# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if not head or not head.next:  # 如果链表为空或者只有一个结点直接返回True
            return True
        my_list = []  # 构建一个列表保存链表的所有元素
        while head:
            my_list.append(head.val)
            head = head.next
        for i in range(len(my_list)//2):  # 遍历列表的一半元素
            if my_list[i] != my_list[-(i+1)]:  # 和列表的倒数第(i+1)个对比，只要有不相等的就返回False
                return False
        return True
