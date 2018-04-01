///**
// * 一句话功能描述
// * 功能详细描述
// *
// * @author Lv Qingyang
// * @date 2018/1/31
// * @email biloba12345@gamil.com
// * @github https://github.com/biloba123
// * @blog https://biloba123.github.io/
// * @since
// */
//public class ProductAndConsumer {
//    public static void main(String args[]) {
//        Object lock=new Object();
//        Product product=new Product(lock);
//        Consumer consumer=new Consumer(lock);
//
//        for (int i = 0; i < 4; i++) {
//            new ProductThread(product).start();
//            new ConsumerThread(consumer).start();
//        }
//    }
//}
//
//class StringValue{
//    public static String value="";
//}
//
//class Product{
//    private Object lock;
//
//    Product(Object lock){
//        this.lock=lock;
//    }
//
//    void setValue(){
//        synchronized (lock){
//            try {
//
//                while (!StringValue.value.equals("")){
//                    lock.wait();
//                }
//
//                String value=""+System.currentTimeMillis();
//                StringValue.value=value;
//                System.out.println(Thread.currentThread().getName()+" set value: "+value);
//                lock.notifyAll();
//
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class Consumer{
//    private Object lock;
//
//    Consumer(Object lock){
//        this.lock=lock;
//    }
//
//    void getValue(){
//        synchronized (lock){
//            try {
//
//                while (StringValue.value.equals("")){
//                    lock.wait();
//                }
//
//                String value=StringValue.value;
//                System.out.println(Thread.currentThread().getName()+" get value: "+value);
//                StringValue.value="";
//                lock.notifyAll();
//
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class ProductThread extends Thread{
//    private Product mProduct;
//
//    ProductThread(Product product){
//        mProduct=product;
//    }
//
//    @Override
//    public void run() {
//        while (true){
//            mProduct.setValue();
//        }
//    }
//}
//
//class ConsumerThread extends Thread{
//    private Consumer mConsumer;
//
//    ConsumerThread(Consumer consumer){
//        mConsumer=consumer;
//    }
//
//    @Override
//    public void run() {
//        while (true){
//            mConsumer.getValue();
//        }
//    }
//}