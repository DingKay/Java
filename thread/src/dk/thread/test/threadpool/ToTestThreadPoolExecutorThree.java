package dk.thread.test.threadpool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
//import static method
import static dk.thread.test.threadpool.ThreadPoolExecutorUtils.*;

/**
 * @author DingKai
 * @Classname ToTestThreadPoolExecutorThree
 * @Description TODO
 * @create 2018-12-10
 */
public class ToTestThreadPoolExecutorThree {
    public static void main(String[] args) throws InterruptedException {
        //Create ThreadPoolExecutor Object ==> Parameter:LinkedBlockingDeque
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (3,6,5, TimeUnit.SECONDS,new LinkedBlockingDeque<Runnable>());
        goStart(new Thread(), threadPoolExecutor);
    }
}
