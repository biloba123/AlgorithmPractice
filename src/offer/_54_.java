package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/10
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _54_ {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        int count = getLoopNodeCount(pHead);
        System.out.println("Loop count: " + count);

        if (count != -1) {
            ListNode front = pHead;
            for (int i = 0; i < count; i++, front = front.next) ;
            for (ListNode node = pHead; node != front; node = node.next, front = front.next) ;
            return front;
        }

        return null;
    }

    private int getLoopNodeCount(ListNode pHead) {
        if (pHead != null && pHead.next != null) {
            ListNode slow = pHead, fast = pHead.next;
            for (; fast != null && fast.next != null && slow != fast; slow = slow.next, fast = fast.next.next)
                ;
            if (slow == fast && slow != null) {
                int count = 1;
                for (ListNode node = slow.next; node != slow; node = node.next, count++) ;
                return count;
            } else {
                return -1;
            }
        }

        return -1;
    }
}
