package offer2;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/24
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public static ListNode createList(int... nodes){
        if(nodes.length<1){
            return null;
        }

        ListNode head=new ListNode(nodes[0]);
        ListNode node=head, temp;
        for (int i = 1; i < nodes.length; i++) {
            temp=new ListNode(nodes[i]);
            node.next=temp;
            node=temp;
        }

        return head;
    }

}
