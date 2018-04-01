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

import java.util.ArrayList;

/**
 * #######

 ########
 生产者消费者问题。生产者生成1~100的随机整数，消费者消费这个整数并打印。
 生产者有三个，分别以1秒、2秒、5秒的速度生成。
 消费者有两个，分别以1秒、3秒的速度消费。


 ########
 本地数据库有远程文件目录映射表，表名为file, 表结构如下：
 key             type
 id              string          //文件唯一id
 name            string
 type            int             //文件类型, 文件夹为1
 parentId        string          //父目录id, 如果没有父目录为0

 class FileBean {
 public String id;
 public String name;
 public int type;
 public String parentId;
 }
 有 Db 工具类 List<FileBean> Db.query(String sql);

 请写一个函数，返回远程文件的整个树形结构。

 */
public class Main {
    public static void main(String[] args){
        Object lock=new Object();
        Producter producter=new Producter(lock);
        Consumer consumer=new Consumer(lock);

        ArrayList<Thread> threads=new ArrayList<>(5);
        threads.add(new ProducterThread("p1", producter, 1000));
        threads.add(new ProducterThread("p2", producter, 2000));
        threads.add(new ProducterThread("p3", producter, 5000));
        threads.add(new ConsumerThread("c1", consumer, 1000));
        threads.add(new ConsumerThread("c2", consumer, 3000));

        for (Thread thread : threads) {
            thread.start();
        }

    }
}
