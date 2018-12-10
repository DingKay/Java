package dk.thread.test.threadpool;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import sun.misc.ThreadGroupUtils;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author DingKai
 * @Classname ToTestLinkedBlockingDequeOne
 * @Description TODO
 * @create 2018-12-10
 */
public class ToTestLinkedBlockingDequeOne {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = ThreadPoolExecutorUtils.getThread();

        //Create ThreadPoolExecutor Object ==> Parameter:LinkedBlockingDeque
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (3,6,5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        //Execute 1.2.3 Then 4.5.6
        ThreadPoolExecutorUtils.startThreeThreads(thread,threadPoolExecutor);
        System.out.println("===> Start Three Thread <===");
        //Print Log
        ThreadPoolExecutorUtils.printLog(threadPoolExecutor);

        //Start Thread Again
        ThreadPoolExecutorUtils.startThreeThreads(thread,threadPoolExecutor);
        System.out.println("===> Start Three Thread Again <===");
        ThreadPoolExecutorUtils.printLog(threadPoolExecutor);

        //wait eight sec
        Thread.sleep(8 * 1000);
        ThreadPoolExecutorUtils.printLog(threadPoolExecutor);

        //Close ThreadPoolExecutor Service
        threadPoolExecutor.shutdown();
    }
}
