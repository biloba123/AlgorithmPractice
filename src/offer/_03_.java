package offer;

import java.util.ArrayList;
import java.util.Stack;

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
class _03_ {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null) return null;

        Stack<Integer> stack=new Stack<>();
        for(; listNode!=null; listNode=listNode.next){
            stack.push(listNode.val);
        }

        ArrayList<Integer> list=new ArrayList<>();
        while(!stack.empty()){
            list.add(stack.pop());
        }

        return list;
    }


       public class ListNode {
           int val;
           ListNode next = null;

           ListNode(int val) {
               this.val = val;
           }
       }

}
