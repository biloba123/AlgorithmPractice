package offer2;

import java.util.Stack;

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
class _05 {
    private Stack<Integer> mInStack = new Stack<>(), mOutStack = new Stack<>();

    public void push(int node) {
        mInStack.push(node);
    }

    public int pop() {
        if (mOutStack.isEmpty()) {
            while (!mInStack.isEmpty()) {
                mOutStack.push(mInStack.pop());
            }
        }

        if (!mOutStack.isEmpty()) {
            return mOutStack.pop();
        }

        throw new RuntimeException("Empty.");
    }
}
