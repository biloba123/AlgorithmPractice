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
class _02 {
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return "";
        }
        return str.toString().replace(" ", "%20");
    }
}
