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
class _12_ {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 1) {
            return null;
        }

        ListNode node1 = head;
        for (; node1 != null && k > 1; node1 = node1.next, k--) ;
        if (node1 == null) {
            return null;
        }

        ListNode node2 = head;
        for (; node1.next != null; node1 = node1.next, node2 = node2.next) ;

        return node2;
    }
}
