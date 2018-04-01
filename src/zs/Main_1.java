package zs;

import java.util.Scanner;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/26
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class Main_1 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String s;
        while (cin.hasNext()){
            s=cin.next();
            String cs=getChildStr(s);
            System.out.println(cs==null?"false": cs);
        }

    }

    private static String getChildStr(String s) {
        if (s==null || s.length()<2) {
            return null;
        }

        int len=s.length();
        int cl;
        String subStr;
        for(int i=0; i<len/2; i++){
            cl=i+1;
            if((len-cl)%cl==0){
                subStr=s.substring(0, cl);
                if(isSubStr(s, subStr,  cl)){
                    return subStr;
                }
            }
        }

        return null;
    }

    private static boolean isSubStr(String s, String subStr, int start) {
        for (int i = start, j=0; i < s.length(); i++) {
            if (s.charAt(i)!=subStr.charAt(j)) {
                return false;
            }
            j++;
            if(j==subStr.length()){
                j=0;
            }
        }
        return true;
    }

}
