package leecode;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/15
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(new _2().evalRPN(new String[]{"3", "-4", "+"}));

        Point[] points = {new Point(1, 1), new Point(1, 1), new Point(2, 2),
                new Point(2, 2)};
        System.out.println(new _3().maxPoints(points));
    }
}
