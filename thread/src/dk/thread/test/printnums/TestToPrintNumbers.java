package dk.thread.test.printnums;

/**
 * @author DingKai
 * @Classname TestToPrintNumbers
 * @Description Anonymous Inner Class : To Create Two Thread Then Print A And Print B Separately.
 * Launch This Class To Test Threads Used Time. Extract Transfer
 * 为了测试双线程分别打印奇偶数所花费的时间 将线程调用抽取出成为method
 * 本次小测试 测试得出在小数据量中时 使用lambda表达式反而出现负优化。
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

        System.out.println("Thread Used Time ==> " + (System.currentTimeMillis() - startTime));

        long startTimeWithLambda =System.currentTimeMillis();

        new TestToPrintNumbers().toGetThreadTimeWithLambda();

        System.out.println("Lambda For Easy Thread Used Time ==> " + (System.currentTimeMillis() - startTimeWithLambda));
    }

    private void toGetThreadTimeWithLambda() {
        Thread t1 = new Thread(() ->{
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
            });

        t1.setName("奇数线程");

        Thread t2 = new Thread(() ->{
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
            });

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

    private void toGetThreadTime() {
        Thread t1 = new Thread(){
            @Override
            public void run (){
                while (i <= total) {
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
