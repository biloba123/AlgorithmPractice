package tencent;

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
        int n, m;
        int x, y;
        while (cin.hasNextInt()) {
            n = cin.nextInt();
            m = cin.nextInt();

            x = (int) Math.pow(2, n) - 1;
            y = (int) Math.pow(2, n - 1);
            if (x == m) {
                System.out.println(y);
            } else {
                int i;
                if (x < m) {
                    i = y;
                } else {
                    i = 1;
                }

                for (; i <= m; i++) {
                    int temp = i;
                    int cur = i;
                    for (int i1 = 1; i1 < n; i1++) {
                        cur = cur / 2 + cur % 2;
                        temp += cur;
                    }

                    if (temp > m) {
                        break;
                    }
                }

                System.out.println(i - 1);
            }

        }
    }


}
