package offer;

import java.util.Stack;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/6
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _19_ {
    public static boolean sequenseIsPop(int[] data1, int[] data2){
        if(data1==null || data1.length<1 || data2==null || data2.length<1 || data1.length!=data2.length){
            return false;
        }

        Stack<Integer> stack=new Stack<>();
        for(int index1=0, index2=0; index1<data1.length; index1++){
            stack.push(data1[index1]);
            for(; !stack.isEmpty() && stack.peek()==data2[index2]; stack.pop(), index2++);
        }

        return stack.isEmpty();

    }
}
