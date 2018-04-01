package offer;

import java.util.ArrayList;

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
class _25_ {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<>();
        if (str == null || str.length()<1) {
            return list;
        }

        char[] chars=str.toCharArray();
        charOnN(chars, 0, list);

        list.sort(String::compareTo);
        return list;
    }

    private void charOnN(char[] chars, int n, ArrayList<String> list) {
        if (n==chars.length-1){
            String s=new String(chars);
            if (list.indexOf(s)==-1) {
                list.add(s);
            }
        }else {
            char temp;
            for(int i=n; i<chars.length; i++){
                temp=chars[n];
                chars[n]=chars[i];
                chars[i]=temp;
                charOnN(chars, n+1, list);
                //记得交换回来
                chars[i]=chars[n];
                chars[n]=temp;
            }
        }
    }
}
