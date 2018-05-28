package neteasy_final;

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
public class Main_2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int count;
        int len;
        String s;
        count = cin.nextInt();
        for (int i = 0; i < count; i++) {
            len = cin.nextInt();
            s = cin.next();
            System.out.println(minLightCount(len, s));
        }

    }

    private static int minLightCount(int len, String s) {
        int light = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '.') {
                light++;
                i += 2;
            }
        }

        return light;
    }
}
