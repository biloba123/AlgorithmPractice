package test;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/4/19
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @since
 */
enum Singleton {
    INSTANCE;

    private Singleton(){
        System.out.println("init");
    }

    public void fun(){
        System.out.println("fun");
    }
}
