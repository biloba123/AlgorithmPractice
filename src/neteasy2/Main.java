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
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long x, f, d, p;
        for (; cin.hasNextLong(); ) {
            x = cin.nextLong();
            f = cin.nextLong();
            d = cin.nextLong();
            p = cin.nextLong();
            System.out.println(longestDays(x, f, d, p));
        }

    }

    private static int longestDays(long x, long f, long d, long p) {
        int day;
        if (f * x >= d) {
            day = (int) (d / x);
        } else {
            day = (int) (f + (d - f * x) / (x + p));
        }

        return day;
    }


}
