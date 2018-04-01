package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/9
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class _53_ {
    public static char firstAppearingOnce(String data) {
        if (data == null || data.length() < 1) {
            throw new RuntimeException("invalid");
        }

        HashMap<Character, Integer> map=new HashMap<>();
        char c='\0';
        for (int i = 0; i < data.length(); i++) {
            c=data.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, -1);
            }else {
                map.put(c, i);
            }
        }

        int minIndex=data.length();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()!=-1 && entry.getValue()<minIndex) {
                minIndex=entry.getValue();
                c=entry.getKey();
            }
        }

        return c;
    }
}
