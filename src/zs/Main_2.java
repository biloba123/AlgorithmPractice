package zs;

import java.util.ArrayList;
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
public class Main_2 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n;
        ArrayList<String> list;
        while (cin.hasNextInt()){
            n=cin.nextInt();
            list= getBrackets(n);
            for (int i = 0; i < list.size()-1; i++) {
                System.out.print(list.get(i)+",");
            }
            System.out.println(list.get(list.size()-1));
        }

    }

    public static ArrayList<String> getBrackets(int n){
        ArrayList<String> list = new ArrayList<>();
        if(n<1) {
            return list;
        }
        getBrackets(n, 0, 0, "", list);
        return list;
    }

    private static void getBrackets(int n, int lc, int rc, String s, ArrayList<String> result){
        if(rc == n){
            result.add(s);
            return;
        }
        if(lc < n){
            getBrackets(n, lc+1, rc, s+"(", result);
        }
        if(rc < lc){
            getBrackets(n, lc, rc+1, s+")", result);
        }
    }

}
