/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} node
 * @return {void} Do not return anything, modify node in-place instead.
 */
var deleteNode = function(node) {
    // 首先要解释下题意
    // 给点的参数node是一个链表中要删除的结点
    // 而且题目又说node一定不是链表的最后一个结点
    // 所以可以采取如下方式：
    // 首先获取到node结点的next结点的val：var x = node.next.val;
    // 然后删除node结点的下一个结点
    // 然后修改node结点的val为x
    if ( !node || !node.next ) {
        return;
    }
    var x = node.next.val;
    node.next = node.next.next;
    node.val = x;
};
