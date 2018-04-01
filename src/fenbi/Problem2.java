package fenbi;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/3/15
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */

import java.util.Random;

/**
 * 生产者消费者问题。生产者生成1~100的随机整数，消费者消费这个整数并打印。
 生产者有三个，分别以1秒、2秒、5秒的速度生成。
 消费者有两个，分别以1秒、3秒的速度消费。
 */
class Problem2 {
}

class Bucket{
    static int value=-1;
}

class Producter{
    private Object lock;

    Producter(Object lock){
        this.lock=lock;
    }

    void putValue(){
        try {
            synchronized (lock){
                if(Bucket.value==-1){//empty
                    Bucket.value=getNum();
                    System.out.println(Thread.currentThread().getName()+" put a num: "+Bucket.value);
                    lock.notify();
                }else {//full
                    System.out.println(Thread.currentThread().getName()+": bucket is full");
                    lock.wait();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    int getNum(){
        return new Random().nextInt(100)+1;
    }
}

class ProducterThread extends Thread{
    private Producter mProducter;
    private int time;

    public ProducterThread(String name, Producter producter, int time) {
        super(name);
        mProducter = producter;
        this.time=time;
    }

    @Override
    public void run() {
        while (true){
            mProducter.putValue();
            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer{
    private Object lock;

    Consumer(Object lock){
        this.lock=lock;
    }

    void getValue(){
        try {
            synchronized (lock){
                if(Bucket.value==-1){//empty
                    System.out.println(Thread.currentThread().getName()+": bucket is empty");
                    lock.wait();
                }else {//full
                    System.out.println(Thread.currentThread().getName()+" get a num: "+Bucket.value);
                    Bucket.value=-1;
                    lock.notify();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


class ConsumerThread extends Thread{
    private Consumer mConsumer;
    private int time;

    public ConsumerThread(String name, Consumer consumer, int time) {
        super(name);
        mConsumer=consumer;
        this.time=time;
    }

    @Override
    public void run() {
        while (true){
            mConsumer.getValue();
            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
