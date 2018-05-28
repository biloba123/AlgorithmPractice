package neteasy2;

import java.util.HashMap;
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
        for (String s; cin.hasNext(); ) {
            s = cin.next();
            System.out.println(getBeautifulCount(s));
        }

    }

    private static int getBeautifulCount(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int charCount = 0;
        char c;
        for (int i = 0; charCount < 3 && i < s.length(); i++) {
            c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                charCount++;
                hashMap.put(c, 1);
            }
        }

        if (charCount < 3) {
            if (charCount == 1) {
                return 1;
            } else {
                return 2;
            }
        }

        return 0;
    }
}
