package dk.thread.test.printnums;

/**
 * Use Anonymous Inner Class To Create Two Thread Then Print A And Print B Separately.
 * Launch This Class To Test Threads Used Time. Extract Thread Code To Method So As To Measure Time.
 * At Last We Found Degrades Performance When Use Java 8 New Features Lambda Expression.
 * @author DingKai
 * @version 1.0
 */
public class TestToPrintNumbers {

    private volatile Short i = 0;

    private Object lock = new Object();

    private final short total = 100;

    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
        this.notify();
        /*notifyAll()*/
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //The Time To Print Numbers 0 To 100 Used Two Threads
        new TestToPrintNumbers().toGetThreadTime();

        System.out.println("Print Numbers 0 To 100 Time Spent Using Two Threads ==> " + (System.currentTimeMillis() - startTime));

        long startTimeWithLambda = System.currentTimeMillis();

        new TestToPrintNumbers().toGetThreadTimeWithLambda();

        System.out.println("Print Numbers 0 To 100 Time Spend Using Lambda ==> " + (System.currentTimeMillis() - startTimeWithLambda));

        long startTimeWithForeach = System.currentTimeMillis();
        //
        new TestToPrintNumbers().toGetPrintNumbersTime();

        System.out.println("Print Numbers 0 To 100 Time Spent Using Foreach ==> " + (System.currentTimeMillis() - startTimeWithForeach));
    }

    /**
     * Lambda Thread
     */
    private void toGetThreadTimeWithLambda() {
        Thread t1 = new Thread(() ->{
            threadOddNums();
        });

        t1.setName("Odd Number Of Thread");

        Thread t2 = new Thread(() ->{
            threadEvenNums();
        });

        t2.setName("Even Number Of Thread");

        t1.start();
        t2.start();

        flagExist();
    }

    /**
     * Two Threads
     */
    private void toGetThreadTime() {
        Thread t1 = new Thread(){
            @Override
            public void run (){
                threadOddNums();
            }
        };

        t1.setName("奇数线程");

        Thread t2 = new Thread(){
            @Override
            public void run(){
                threadEvenNums();
            }
        };

        t2.setName("偶数线程");

        t1.start();
        t2.start();

        flagExist();
    }

    private void threadEvenNums() {
        while (i <= total) {
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
            if (i == total) {
                setFlag(true);
            }
        }
    }

    private void threadOddNums() {
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

    /**
     * Flag For Notify ==Main Thread ==
     */
    private void flagExist() {
        while (!isFlag()) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Normal Standard >>Foreach<<
     */
    private void toGetPrintNumbersTime(){
        System.out.println("== Foreach Start ==");
        for (int j = 0; j <= 100; j++) {
            System.out.println("j = " + j);
        }
    }
}
