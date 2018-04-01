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
class _55_ {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }

        ListNode first=new ListNode(-1);
        first.next=pHead;
        for(ListNode pre=first, node=pHead; node!=null && node.next!=null; ){
            if(node.val==node.next.val){
                for(; node.next!=null && node.val==node.next.val; node=node.next);
                node=node.next;
                pre.next=node;
            }else {
                node=node.next;
                pre=pre.next;
            }
        }

        return first.next;
    }
}
