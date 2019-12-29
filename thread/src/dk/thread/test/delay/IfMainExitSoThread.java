package dk.thread.test.delay;

/**
 * @author DingKai
 * @version 1.0
 */
public class IfMainExitSoThread {
    public static void main(String[] args) {
        System.out.println("main start");

//        threadRun();
        new ThreadTest().start();

        System.out.println("main thread is end");
        System.exit(0);

    }

}
