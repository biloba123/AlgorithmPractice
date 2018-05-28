package neteasy2;

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
public class Main_3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (String s; cin.hasNext(); ) {
            s = cin.next();
            System.out.println(getMaxLen(s));
        }

    }

    private static int getMaxLen(String s) {
        int len = s.length();
        if (s.length() < 2) {
            return 1;
        }

        int maxLen = 0, curLen = 0;
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                curLen++;
            } else {
                maxLen = Math.max(maxLen, curLen + 1);
                curLen = 0;
            }
        }

        maxLen = Math.max(maxLen, curLen + 1);
        return maxLen;
    }
}
