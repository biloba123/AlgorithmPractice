package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/9
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _42_ {
    public String LeftRotateString(String str,int n) {
        if (str==null || str.length()<1) {
            return "";
        }

        char[] chars=str.toCharArray();
        reverse(chars, 0, n-1);
        reverse(chars, n, chars.length-1);
        reverse(chars, 0, chars.length-1);

        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        if (start>=end) {
            return;
        }

        char temp;
        for(int i=start, j=end; i<j; i++, j--){
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
    }
}
