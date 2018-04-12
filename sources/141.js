/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    // 空链表属于没有环的
    // 只有一个结点的链表如果next域指向自己也属于有环的
    // 可以投机取巧一下，因为题目没说不可以修改链表，而且链表中的每个结点的val都不可能是null
    // 所以可以在遍历链表的时候判断当前结点的val是不是null
    // 如果不是则把当前结点的val设置为null
    // 当遍历到某个结点的val为null的时候则发现了环
    // 否则直到遍历结束也没发现，则不存在环
    if ( !head ) {
        return false;
    } else {
        while ( head ) {
            if ( !head.val ) {
                return true;
            }
            head.val = null;
            head = head.next;
        }
        return false;
    }
};
