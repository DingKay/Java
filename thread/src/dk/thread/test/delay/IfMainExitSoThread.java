package dk.thread.test.delay;

/**
 * @author DingKai
 * @Classname IfMainExitSoThread
 * @Description TODO
 * @create 2019/4/24
 */
public class IfMainExitSoThread {
    public static void main(String[] args) {
        System.out.println("main start");

//        threadRun();
        new ThreadTest().run();

        System.out.println("main thread is end");
        System.exit(0);

    }

    private static void threadRun() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread start");
                    Thread.sleep(3000);
                    System.out.println("Thread end");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
