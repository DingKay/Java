package dk.thread.test.delay;

/**
 * @author DingKai
 * @version 1.0
 */
public class ThreadTest extends Thread {
    @Override
    public void run() {
        System.out.println("ThreadTest run start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThreadTest run end");
    }
}
