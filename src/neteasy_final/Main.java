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
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, w;
        int[] v;
        int[] count = new int[1];
        while (cin.hasNextInt()) {
            count[0] = 0;
            n = cin.nextInt();
            w = cin.nextInt();
            v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = cin.nextInt();
            }

            fun(w, v, 0, 0, count);
            System.out.println(count[0] + 1);
        }

    }

    private static boolean fun(int w, int[] v, int curW, int which, int[] count) {
        if (curW > w) {
            return false;
        }


        if (which < v.length) {
            if (fun(w, v, curW + v[which], which + 1, count)) {
                System.out.println("--" + curW + " " + v[which]);
                count[0]++;
            }
            fun(w, v, curW, which + 1, count);
        }

        return true;
    }

}
