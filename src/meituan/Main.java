package meituan;

import java.util.Scanner;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/15
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s;
        while (cin.hasNext()) {
            s = cin.next();
            System.out.println(getMin(s));
        }

//        System.out.println(getMin("0123456789"));
    }

    public static int getMin(String s) {
        if (s == null || s.length() < 1) {
            return 1;
        }

        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
        }

        int min = 1, count = 0;
        //如果1~9不全则最小正数就在1~9中
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
            count = Math.max(count, arr[i]);
        }

        int num;
        for (int i = 0; i <= count; i++) {
            num = 0;
            for (int i1 = 0; i1 < 10; i1++) {
                if (arr[i1] == 0) {
                    return min * 10 + i1;
                } else {
                    arr[i1]--;
                }
            }
            min = min * 10 + num;
        }


        return min;
    }

}
