package offer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/7
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _32_ {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() < 1) {
            return -1;
        }

        char[] chars = str.toCharArray();
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap();

        for (char aChar : chars) {
            if (hashMap.containsKey(aChar)) {
                hashMap.replace(aChar, hashMap.get(aChar) + 1);
            } else {
                hashMap.put(aChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : hashMap.entrySet()) {
            if (characterIntegerEntry.getValue() == 1) {
                return str.indexOf(characterIntegerEntry.getKey());
            }
        }

        return -1;
    }
}
