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
        System.out.println("start");
        Singleton singleton=Singleton.INSTANCE;
        System.out.println("call fun");
        singleton.fun();
    }

    
}
