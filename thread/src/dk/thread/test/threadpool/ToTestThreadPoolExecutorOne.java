package dk.thread.test.threadpool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import static dk.thread.test.threadpool.ThreadPoolExecutorUtils.printLog;
import static dk.thread.test.threadpool.ThreadPoolExecutorUtils.startThreeThreads;

/**
 * @author DingKai
 * @Classname ToTestThreadPoolExecutorOne
 * @Description To Test ThreadPoolExecutor Rule
 *              And if ThreadPoolExecutor Parameter Use SynchronousQueue
 *              Then When Task Execute Will Create A New Thread
 *              SynchronousQueue Will Not To Storage Task
 * @create 2018-12-10
 */
public class ToTestThreadPoolExecutorOne {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = ThreadPoolExecutorUtils.getThread();

        //Create ThreadPoolExecutor Object ==> Parameter:SynchronousQueue
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (6,10,5, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());

        //Execute 1.2.3 Then 4.5.6
        startThreeThreads(thread, threadPoolExecutor);
        //print Log
        System.out.println("===> Start Three Threads<===");
        printLog(threadPoolExecutor);
        //again
        startThreeThreads(thread, threadPoolExecutor);
        System.out.println("===> Start Three Threads Again <===");
        printLog(threadPoolExecutor);
        //then
        Thread.sleep(8 * 1000);
        printLog(threadPoolExecutor);
        //Close ThreadPoolExecutor Service
        threadPoolExecutor.shutdown();
    }


}
