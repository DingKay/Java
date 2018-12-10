package dk.thread.test.threadpool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
//import static method
import static dk.thread.test.threadpool.ThreadPoolExecutorUtils.*;


/**
 * @author DingKai
 * @Classname ToTestThreadPoolExecutorTwo
 * @Description When Number Of Task Over Then Core Pool Size.
                ThreadPoolExecutor Will Create A New Thread To Execute Task.
 * @create 2018-12-10
 */
public class ToTestThreadPoolExecutorTwo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = getThread();

        //Create ThreadPoolExecutor Object ==> Parameter:SynchronousQueue
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (3,6,5, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());

        goStart(new Thread(),threadPoolExecutor);
    }
}
