package dk.thread.test.threadpool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author DingKai
 * @Classname ThreadPoolExecutorUtils
 * @Description TODO
 * @create 2018-12-10
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
