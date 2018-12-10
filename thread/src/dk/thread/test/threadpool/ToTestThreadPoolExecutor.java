package dk.thread.test.threadpool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author DingKai
 * @Classname ToTestThreadPoolExecutor
 * @Description To Test ThreadPoolExecutor Rule
 *              And if ThreadPoolExecutor Parameter Use SynchronousQueue
 *              Then When Task Execute Will Create A New Thread
 *              SynchronousQueue Will Not To Storage Task
 * @create 2018-12-10
 */
public class ToTestThreadPoolExecutor {
    private static void startThreeThreads(Thread thread, ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.execute(thread);
        threadPoolExecutor.execute(thread);
        threadPoolExecutor.execute(thread);
    }

    private static void printLog(ThreadPoolExecutor threadPoolExecutor) {
        System.out.println("corePoolSize ==> " + threadPoolExecutor.getCorePoolSize());
        System.out.println("PoolSize ==> " + threadPoolExecutor.getPoolSize());
        System.out.println("Queue Size ==> " + threadPoolExecutor.getQueue().size());
    }

    public static void main(String[] args) throws InterruptedException {
        //Thread Anonymous Inner Class
        Thread thread = new Thread(){
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

        //Create ThreadPoolExecutor Object ==> Parameter:SynchronousQueue
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (6,10,5, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());

        //Execute 1.2.3 Then 4.5.6
        startThreeThreads(thread, threadPoolExecutor);
        //printLog
        System.out.println("===> Start Three Threads<===");
        printLog(threadPoolExecutor);
        //again
        startThreeThreads(thread, threadPoolExecutor);
        System.out.println("===> Start Three Threads Again <===");
        printLog(threadPoolExecutor);
        //then
        Thread.sleep(8 * 1000);
        printLog(threadPoolExecutor);

    }
}
