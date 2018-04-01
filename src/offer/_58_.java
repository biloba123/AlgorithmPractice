package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

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
class _58_ {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }

        Queue<TreeNode> queue=new ArrayDeque<>();
        Stack<Integer> stack=new Stack<>();
        queue.add(pRoot);
        int temp=0;
        ArrayList<Integer> list;
        TreeNode node;
        boolean isLtoR=true;
        for(int count=1; !queue.isEmpty(); count=temp, temp=0,isLtoR=!isLtoR){
            list=new ArrayList<>();
            for(; count>0; count--){
                node=queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    temp++;
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    temp++;
                }

                if (isLtoR){
                    list.add(node.val);
                }else {
                    stack.push(node.val);
                }
            }

            for(; !stack.isEmpty(); list.add(stack.pop()));

            lists.add(list);
        }

        return lists;
    }
}
