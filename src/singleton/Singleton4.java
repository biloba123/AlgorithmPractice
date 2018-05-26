package singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
class Singleton4 implements Serializable {
    private static final Singleton4 INSTANCE = new Singleton4();

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return INSTANCE;
    }

//    private Object readResolve() throws ObjectStreamException {
//        return getInstance();
//    }

    public static void main(String[] args) throws Exception {
        // 支持java.io.Serializable的对象都可以写入流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(Singleton4.getInstance());

        // 根据字节流生成对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Singleton4 s1 = (Singleton4) ois.readObject();

        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);


    }


}
