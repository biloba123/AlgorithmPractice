package DP_EX;


import java.util.ArrayList;
import java.util.List;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/6/11
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class ObserverTest {

    public static void main(String[] args){
        Product p1=new Product("iphone", 4999);
        Product p2=new Product("surface", 9999);
        Member xm=new Member();
        p1.register(xm);
        p2.register(xm);

        p1.setPrice(4950);
        p2.setName("surface pro5");
        p1.unregister(xm);
        p1.setPrice(4990);
        p2.setPrice(9998);
    }
}

interface Observer{
    void update(Product product);
}

class Member implements Observer{

    @Override
    public void update(Product product) {
        System.out.println(product);
    }
}

interface Observable{
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}

class Product implements Observable{
    private List<Observer> mObservers=new ArrayList<>();
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        if (!mObservers.contains(observer)) {
            mObservers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
        }
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "mObservers=" + mObservers +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}