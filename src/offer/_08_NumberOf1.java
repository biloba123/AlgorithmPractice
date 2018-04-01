package offer;

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
class _08_NumberOf1 {
    public static int NumberOf1(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += (n & 1);
            n >>>= 1;
        }
// 返回求得的结果
        return result;
    }
}
