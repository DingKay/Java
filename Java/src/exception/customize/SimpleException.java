package exception.customize;

/**
 * @author DingKai
 * @Classname SimpleException
 * @Description TODO
 * @create 2019/4/23
 */
public class SimpleException extends Exception {
    private String errMsg;

    public SimpleException(String errMsg) {
        super(errMsg);
    }
}
