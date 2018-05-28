package offer2;

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
class _09 {
    public int NumberOf1(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++, n >>= 1) {
            count += ((n) & 1);
        }
        return count;
    }
}
