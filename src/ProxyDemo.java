import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/1/28
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @since
 */
public class ProxyDemo {
    public static void main(String args[]) {
        Cart cart = new Cart();
//        CartProxy cartProxy=new CartProxy(cart);
//        cartProxy.addCommodity();
        Subject proxy = (Subject) Proxy.newProxyInstance(
                Cart.class.getClassLoader(),
                Cart.class.getInterfaces(),
                new MyInvocationHandler(cart)
        );
        proxy.addCommodity();
    }
}


interface Subject {
    void addCommodity();
}

class Cart implements Subject {
    @Override
    public void addCommodity() {
        System.out.println("add success!");
    }
}

class CartProxy implements Subject {
    private Cart mCart;

    public CartProxy(Cart c) {
        mCart = c;
    }

    @Override
    public void addCommodity() {
        System.out.println("is login?");
        System.out.println("yes");
        mCart.addCommodity();
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Cart mCart;

    public MyInvocationHandler(Cart c) {
        mCart = c;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("addCommodity")) {
            System.out.println("is login?");
            System.out.println("yes");
            return method.invoke(mCart, args);
        }
        return null;
    }
}