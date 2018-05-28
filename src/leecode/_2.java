package leecode;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/1/31
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @since
 */
public class _2 {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length < 1) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            try {
                stack.push(Integer.parseInt(token));
            } catch (NumberFormatException e) {
                try {
                    int end = stack.pop(),
                            front = stack.pop();
                    int result;
                    if (token == "+") {
                        result = front + end;
                    } else if (token == "-") {
                        result = front - end;
                    } else if (token == "*") {
                        result = front * end;
                    } else {
                        result = front / end;
                    }
                    stack.push(result);
                } catch (EmptyStackException e1) {
                    return 0;
                }
            }
        }

        if (!stack.isEmpty()) {
            int result = stack.pop();
            if (stack.isEmpty()) {
                return result;
            }
        }

        return 0;
    }
}

