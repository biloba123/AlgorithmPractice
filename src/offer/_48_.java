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
class _48_ {
    public int StrToInt(String str) {
        if (str==null || str.length()<1) {
            return 0;
        }

        char[] chars=str.toCharArray();
        int sign=1, i=0;
        if (chars[0] == '+') {
            i++;
            sign=1;
        }else if (chars[0] == '-') {
            i++;
            sign=-1;
        }else if(!Character.isDigit(chars[0])){
            return 0;
        }

        int num=0;
        int step=1;
        for(int j=chars.length-1; j>=i; j--, step*=10){
            if(Character.isDigit(chars[j])){
                num+=step*(chars[j]-'0');
                if (num > 0x8000_0000L) {
                    throw new NumberFormatException(num+"");
                }
            }else {
                return 0;
            }
        }
        return num*sign;
    }
}
