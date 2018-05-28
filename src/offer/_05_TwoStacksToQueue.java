package offer;

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
class _05_TwoStacksToQueue {
    public static class MyQueue<T> {
        private Stack<T> mInStack;
        private Stack<T> mOutStack;

        public MyQueue() {
            mInStack = new Stack<>();
            mOutStack = new Stack<>();
        }

        public void appendTail(T val) {
            mInStack.push(val);
        }

        public T deleteHead() {
            if (mOutStack.empty()) {
                while (!mInStack.empty()) {
                    mOutStack.push(mInStack.pop());
                }
            }

            if (mOutStack.isEmpty()) return null;

            return mOutStack.pop();
        }
    }
}
