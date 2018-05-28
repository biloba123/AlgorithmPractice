package qihoo;

import java.util.Arrays;
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
        int count;
        count = cin.nextInt();
        long[] colors = new long[3];
        for (int i = 0; i < count; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                colors[i1] = cin.nextLong();
            }

            Arrays.sort(colors);
            System.out.println(Arrays.toString(colors));
            long x = (2 * colors[0] + 2 * colors[1] - colors[2]) / 3;
            System.out.println("x=" + x);

            long result = 0;
            if (colors[0] != 0 && x >= 0) {
                colors[0] += colors[1] - x;
                colors[2] += x;
                colors[1] = 0;
            }
            System.out.println(Arrays.toString(colors));

            result += Math.min(colors[2] / 2, colors[0]);
            colors[0] -= result;
            colors[2] -= result * 2;
            Arrays.sort(colors);
            System.out.println(Arrays.toString(colors));
            result += Math.min(colors[2] / 2, colors[1]);


            System.out.println(Arrays.toString(colors));

            System.out.println(result);

        }
    }

}
