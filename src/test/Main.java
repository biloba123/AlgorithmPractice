package test;
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
        Main m1=new Main();
        Main m2=m1;
        String s1="hello", s2=s1+"";
        System.out.println((s1==s1)+" "+s1.equals(s2));
    }

    
}
