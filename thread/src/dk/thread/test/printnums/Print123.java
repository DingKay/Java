package dk.thread.test.printnums;

/**
 * @author DingKai
 * @Classname Print123
 * @Description Three Threads Of To Print 1.2.3...100
 * @create 2019/1/2
 */
public class Print123 {
    //Numbers Of Total
    private short total = 100;
    //Numbers Of Start
    private short i = 0;
    //String Of Control Threads
    private static String key = "one";
    //Above "String" Get/Set Method To Control Threads
    public static String getKey() {
        return key;
    }

    public static void setKey(String newKey) {
        key = newKey;
    }
    //Thread Synchronized Lock >>Object<<
    private final Integer lock = 0;

    public static void main(String[] args) {
        System.out.println("=== > Start < ===");
        new Print123().printOneTwoThreeWithLambda();
    }

    private void printOneTwoThreeWithLambda(){
        new Thread(() -> {
            while(i < total){
                ifPrint123("one");
            }
        }).start();
        new Thread(() -> {
            while(i < total){
                ifPrint123("two");
            }
        }).start();
        new Thread(() -> {
            while(i < total){
                ifPrint123("three");
            }
        }).start();
    }

    private void ifPrint123(String key) {
        synchronized (lock) {
            if (!getKey().equals(key)) {
                try {
                    /*Logs To Test >>NotifyAll<< And >>Wait<<
                    System.out.println("Sleep 2 Seconds");
                    Thread.sleep(2000);
                    */
                    //Thread wait And Blocking
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (i < total){
                System.out.println(Thread.currentThread().getName()+" --> " + ++i);
                setKey(switchString(key));
                //Synchronized lock >> Notify All Blocking Thread
                lock.notifyAll();
                /*Logs To Test >>NotifyAll<< And >>Wait<<
                System.out.println("notifyAll is End");
                */
            }
        }
    }

    private String switchString(String swi){
        switch (swi){
            case "one":
                return "two";
            case "two":
                return "three";
            case "three":
                return "one";
            default:
                return null;
        }
    }
}
