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
class _18_ {
    public static class MinStack {
        private Stack<Integer> mStack = new Stack<>();
        private Stack<Integer> mMinStack = new Stack<>();

        public void push(int val) {
            mStack.push(val);
            if (mMinStack.isEmpty() || mMinStack.peek() > val) {
                mMinStack.push(val);
            } else {
                mMinStack.push(mMinStack.peek());
            }
        }

        public int pop() {
            if (mStack.isEmpty()) {
                throw new RuntimeException("Empty");
            }

            mMinStack.pop();
            return mStack.pop();
        }

        public int min() {
            if (mMinStack.isEmpty()) {
                throw new RuntimeException("Empty");
            }
            return mMinStack.peek();
        }

        public int top() {
            if (mStack.isEmpty()) {
                throw new RuntimeException("Empty");
            }
            return mStack.peek();
        }
    }
}
