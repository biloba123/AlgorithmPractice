package singleton;

import java.lang.reflect.Constructor;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/5/7
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
class Singleton5 {
    private static class Singleton5Holder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
        if (getInstance() != null) {
            throw new AssertionError();
        }
    }

    public static Singleton5 getInstance() {
        return Singleton5Holder.INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        Class<Singleton5> c = Singleton5.class;
        // 获取无参构造方法
        Constructor<Singleton5> constructor = c.getDeclaredConstructor();
        // 反射机制使得private方法可以被访问
        constructor.setAccessible(true);

        Singleton5 s1 = constructor.newInstance();
        Singleton5 s2 = Singleton5.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
