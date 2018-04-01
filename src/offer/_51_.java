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
class _51_ {
    public boolean match(char[] str, char[] pattern) {
        if (str==null || pattern==null) {
            return false;
        }
        return match(new String(str), new String(pattern));
    }

    public static boolean match(String input, String pattern) {
        if (input == null || pattern == null) {
            return false;
        }
        return matchCore(input, 0, pattern, 0);
    }

    private static boolean matchCore(String input, int i, String pattern, int i1) {
        int iLen=input.length(), pLen=pattern.length();
        if(i>=iLen && i1>=pLen){
            return true;
        }

        if(i<iLen && i1>=pLen){
            return false;
        }

        for(; i<iLen && i1<pLen; ){
            if(i1+1<pLen && pattern.charAt(i1+1)=='*'){
                return matchCore(input, i, pattern, i1+2)   //*匹配0个
                        || (input.charAt(i)==pattern.charAt(i1)
                             && (matchCore(input, i+1, pattern, i1+2) //1个
                                        ||matchCore(input, i+1, pattern, i1)));//1个以上
            }else {
                if(input.charAt(i)==pattern.charAt(i1) || pattern.charAt(i1)=='.'){
                    i++;
                    i1++;
                }else {
                    return false;
                }
            }
        }

        if(i>=iLen && i1>=pLen){
            return true;
        }

        return false;
    }
}
