package dk.thread.test.printnums;

/**
 * @author DingKai
 * @Classname TestToPrintNumbers
 * @Description 匿名内部类 创建两个线程 分别打印奇偶数
 * 为了测试双线程分别打印奇偶数所花费的时间 将线程调用抽取出成为method
 * @create 2018-11-23
 */
public class TestToPrintNumbers {

    private volatile Short i=0;

    private Object lock = new Object();

    private final short total = 100;

    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
        this.notifyAll();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        new TestToPrintNumbers().toGetThreadTime();

        System.out.println(System.currentTimeMillis() - startTime);
    }

    private void toGetThreadTime() {
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
                    if(i == total)
                        setFlag(true);
                }
            }
        };

        t2.setName("偶数线程");

        t1.start();
        t2.start();

        while(!isFlag())
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
