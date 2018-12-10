package dk.thread.test.threadpool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
//import static method
import static dk.thread.test.threadpool.ThreadPoolExecutorUtils.*;

/**
 * @author DingKai
 * @Classname ToTestThreadPoolExecutorOne
 * @Description To Test ThreadPoolExecutor Rule And Find The Difference.
                If ThreadPoolExecutor Parameter Use SynchronousQueue Then When
                Task Execute Will Create A New Thread.
                SynchronousQueue Will Not To Storage Task
 * @create 2018-12-10
 */
public class ToTestThreadPoolExecutorOne {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = getThread();

        //Create ThreadPoolExecutor Object ==> Parameter:SynchronousQueue
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (6,10,5, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());

        goStart(new Thread(),threadPoolExecutor);
    }
}
