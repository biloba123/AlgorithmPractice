package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/5
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _10_DeleteNode {
    public static class ListNode {
        int value; // 保存链表的值
        ListNode next; // 下一个结点
    }

    public static ListNode deleteNode(ListNode head, ListNode toBeDeleted) {
        if (head == null || toBeDeleted == null) {
            return head;
        }

        ListNode next = toBeDeleted.next;
        if (next != null) {
            toBeDeleted.value = next.value;
            toBeDeleted.next = next.next;
            next.next = null;
        } else {
            ListNode node = head;
            for (; node.next != toBeDeleted; node = node.next) ;
            node.next = null;
        }

        return head;
    }
}
