package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/8
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _41_ {
    public String ReverseSentence(String str) {
        if (str==null || str.length()<1) {
            return "";
        }

        char[] chars=str.toCharArray();
        reverse(chars, 0, chars.length-1);

        int start=-1;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]!=' '){
                if(start==-1) {
                    start = i;
                }
            }else {
                if(start!=-1){
                    reverse(chars, start, i-1);
                    start=-1;
                }
            }
        }

        if (start!=-1){
            reverse(chars, start, chars.length-1);
        }

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
