package dk.thread.test.printnums;

/**
 * @author DingKai
 * @Classname TestToPrintNumbers
 * @Description 匿名内部类 创建两个线程 分别打印奇偶数
 * @create 2018-11-23
 */
public class TestToPrintNumbers {

    private static volatile Short i=0;

    private static Object lock = new Object();

    private static final short total = 100;

    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run(){
                while(i <= total){
                    synchronized (lock) {
                        if (i % 2 == 1) {
                            System.out.println(Thread.currentThread().getName() + ":" + i++);
                            lock.notifyAll();
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        };

        t1.setName("奇数线程");

        Thread t2 = new Thread(){
            @Override
            public void run(){
                while (i <= total){
                    synchronized (lock) {
                        if (i % 2 == 0) {
                            System.out.println(Thread.currentThread().getName() + ":" + i++);
                            lock.notifyAll();
                        } else {
                            if (i <= total) {
                                try {
                                    lock.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        };

        t2.setName("偶数线程");

        t1.start();
        t2.start();

    }
}
