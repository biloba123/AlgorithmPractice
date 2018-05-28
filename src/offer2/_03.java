package offer2;

import java.util.ArrayList;

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
class _03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        }

        printListFromTailToHead(listNode, list);

//        Stack<Integer> stack=new Stack<>();
//        for(ListNode node=listNode; node!=null; node=node.next){
//            stack.push(node.val);
//        }
//
//        while (!stack.isEmpty()){
//            list.add(stack.pop());
//        }

        return list;
    }

    private void printListFromTailToHead(ListNode listNode, ArrayList<Integer> list) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next, list);
            list.add(listNode.val);
        }
    }
}
