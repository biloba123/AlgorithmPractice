package qihoo;

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
        Scanner cin = new Scanner(System.in);
        int count;
        count = cin.nextInt();
        int n;
        int pixels;
        int[] points = new int[4];
        for (int i = 0; i < count; i++) {
            n = cin.nextInt();
            pixels = 0;
            for (int i1 = 0; i1 < n; i1++) {
                for (int i2 = 0; i2 < 4; i2++) {
                    points[i2] = cin.nextInt();
                }
                pixels += (Math.abs(points[2] - points[0]) + 1)
                        * (Math.abs(points[3] - points[1]) + 1);
            }
            System.out.println(pixels);
        }
    }

}
