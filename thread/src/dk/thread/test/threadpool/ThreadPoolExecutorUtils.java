package dk.thread.test.threadpool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author DingKai
 * @version 1.0
 */
public class ThreadPoolExecutorUtils {
    public static void startThreeThreads(Thread thread, ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.execute(thread);
        threadPoolExecutor.execute(thread);
        threadPoolExecutor.execute(thread);
    }

    public static void printLog(ThreadPoolExecutor threadPoolExecutor) {
        System.out.println("corePoolSize ==> " + threadPoolExecutor.getCorePoolSize());
        System.out.println("PoolSize ==> " + threadPoolExecutor.getPoolSize());
        System.out.println("Queue Size ==> " + threadPoolExecutor.getQueue().size());
    }

    public static void goStart(Thread thread, ThreadPoolExecutor threadPoolExecutor) throws InterruptedException {
        //Execute 1.2.3 Then 4.5.6
        startThreeThreads(thread,threadPoolExecutor);
        System.out.println("===> Start Three Thread <===");
        //Print Log
        printLog(threadPoolExecutor);

        //Start Thread Again
        startThreeThreads(thread,threadPoolExecutor);
        System.out.println("===> Start Three Thread Again <===");
        printLog(threadPoolExecutor);

        //wait eight sec
        Thread.sleep(8 * 1000);
        printLog(threadPoolExecutor);

        //Close ThreadPoolExecutor Service
        threadPoolExecutor.shutdown();
    }

    public static Thread getThread() {
        //Thread Anonymous Inner Class
        return new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + "==> Running");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
