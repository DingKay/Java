package dk.thread.test.threadpool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
//import static method
import static dk.thread.test.threadpool.ThreadPoolExecutorUtils.printLog;
import static dk.thread.test.threadpool.ThreadPoolExecutorUtils.startThreeThreads;

/**
 * @author DingKai
 * @Classname ToTestThreadPoolExecutorTwo
 * @Description TODO
 * @create 2018-12-10
 */
public class ToTestThreadPoolExecutorTwo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = ThreadPoolExecutorUtils.getThread();

        //Create ThreadPoolExecutor Object ==> Parameter:SynchronousQueue
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (3,6,5, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
        //Execute 1.2.3 Then 4.5.6
        startThreeThreads(thread,threadPoolExecutor);
        System.out.println("===> Start Three Thread <===");
        printLog(threadPoolExecutor);
        //again
        startThreeThreads(thread,threadPoolExecutor);
        System.out.println("===> Start Three Thread Again <===");
        printLog(threadPoolExecutor);

        //wait eight sec
        Thread.sleep(8 * 1000);

        printLog(threadPoolExecutor);
        //Close ThreadPoolExecutor Object Service
        threadPoolExecutor.shutdown();
    }
}
