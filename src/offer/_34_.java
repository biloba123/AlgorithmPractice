package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/8
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _34_ {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null || pHead2==null) {
            return null;
        }

        ListNode node1, node2;
        int len1=0, len2=0;
        for(node1=pHead1; node1!=null; node1=node1.next, len1++);
        for(node2=pHead2; node2!=null; node2=node2.next, len2++);

        node1=pHead1;
        node2=pHead2;
        int i, dif;
        if (len1>len2) {
            dif=len1-len2;
            for(i=0; i<dif; node1=node1.next, i++);
        }else {
            dif=len2-len1;
            for(i=0; i<dif; node2=node2.next, i++);
        }

        for (; node1!=null; node1=node1.next, node2=node2.next){
            if (node1==node2){
                return node1;
            }
        }
        return null;
    }
}
