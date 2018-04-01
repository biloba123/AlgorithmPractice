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
class _13_ {
    public static ListNode ReverseList(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }

        ListNode node1=head, node2=head.next, temp;
        head.next=null;
        for(; node2!=null; node1=node2, node2=temp){
            temp=node2.next;
            node2.next=node1;
        }

        return node1;
    }
}
