import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/1/31
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @since
 */
public class FruitDish {
    public static void main(String args[]) {
        ReentrantLock lock = new ReentrantLock();
        Condition[] conditions = new Condition[2];
        conditions[0] = lock.newCondition();
        conditions[1] = lock.newCondition();

        ProductThread father = new ProductThread(new Product(lock, conditions[0]), "Father", Fruit.ORANGE);
        ProductThread mather = new ProductThread(new Product(lock, conditions[1]), "Mather", Fruit.APPLE);
        ConsumerThread son = new ConsumerThread(new Consumer(lock, conditions[1], conditions[0]), "Son", Fruit.APPLE);
        ConsumerThread daughter = new ConsumerThread(new Consumer(lock, conditions[0], conditions[1]), "Daughter", Fruit.ORANGE);

        father.start();
        mather.start();
        son.start();
        daughter.start();
    }
}


enum Fruit {
    APPLE, ORANGE, NONE
}

class Dish {
    public static Fruit sFruit = Fruit.NONE;
}

class Product {
    private ReentrantLock lock;
    private Condition mCondition;
    private Fruit mFruit;//生产者放的水果

    Product(ReentrantLock lock, Condition condition) {
        this.lock = lock;
        mCondition = condition;
    }

    void setFruit(Fruit fruit) {
        mFruit = fruit;
    }

    void putFruit() {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();

            //盘子里有水果则等待
            while (!Dish.sFruit.equals(Fruit.NONE)) {
                System.out.println(threadName + ": Dish is full and I am waiting...");
                mCondition.await();
            }

            System.out.println(threadName + ": Dish is empty and I put an " + mFruit);
            Dish.sFruit = mFruit;
            //通知其他所有等待的线程
            mCondition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}

class Consumer {
    private ReentrantLock lock;
    private Condition mCondition;
    private Condition mOtherCondition;
    private Fruit mFruit;//消费者吃的水果

    Consumer(ReentrantLock lock, Condition condition, Condition otherCondition) {
        this.lock = lock;
        mCondition = condition;
        mOtherCondition = otherCondition;
    }

    void setFruit(Fruit fruit) {
        mFruit = fruit;
    }

    void eatFruit() {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            while (!Dish.sFruit.equals(mFruit)) {
                if (Dish.sFruit.equals(Fruit.NONE)) {
                    System.out.println(threadName + ": Dish is empty and I am waiting");
                } else {
                    System.out.println(threadName + ": There is no fruit I eat and I am waiting");
                }
                mCondition.await();
            }

            System.out.println(threadName + ": I get an " + mFruit + " and then eat it.");
            Dish.sFruit = Fruit.NONE;
            mOtherCondition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class ProductThread extends Thread {
    private Product mProduct;

    ProductThread(Product product, String name, Fruit fruit) {
        mProduct = product;
        mProduct.setFruit(fruit);
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            mProduct.putFruit();
        }
    }
}

class ConsumerThread extends Thread {
    private Consumer mConsumer;

    ConsumerThread(Consumer consumer, String name, Fruit fruit) {
        mConsumer = consumer;
        mConsumer.setFruit(fruit);
        setName(name);
    }

    @Override
    public void run() {
        while (true) {
            mConsumer.eatFruit();
        }
    }
}

