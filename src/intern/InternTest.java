package intern;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/6/4
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class InternTest {
    public static void main(String[] args){
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);

//        String baseStr = "baseStr";
//        final String baseFinalStr = "baseStr";
//
//        String str1 = "baseStr01";
//        String str2 = "baseStr"+"01";
//        String str3 = baseStr + "01";
//        String str4 = baseFinalStr+"01";
//        String str5 = new String("baseStr01").intern();
//
//        System.out.println(str1 == str2);//#3
//        System.out.println(str1 == str3);//#4
//        System.out.println(str1 == str4);//#5
//        System.out.println(str1 == str5);//#6
    }
}
