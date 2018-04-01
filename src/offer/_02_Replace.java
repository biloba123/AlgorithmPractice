package offer;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/3
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @since
 */
class _02_Replace {
    public static int replace(char[] string, int count){
        if (string==null || count<1) return -1;

        int whiteCount=0;
        for(int i=0; i<count; i++){
            if(string[i]==' ') whiteCount++;
        }

        int newCount=count+whiteCount*2;
        if(newCount>string.length) return -1;

        for(int i=newCount-1, j=count-1; i>=0 && j>=0; j--, i--){
            if (string[j] == ' ') {
                string[i--]='0';
                string[i--]='2';
                string[i]='%';
            }else {
                string[i]=string[j];
            }
        }
        return newCount;
    }

    public static String replaceSpace(StringBuffer str) {
        if(str==null){
            throw new RuntimeException("Invalid input.");
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
