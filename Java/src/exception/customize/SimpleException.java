package exception.customize;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

/**
 * @author DingKai
 * @Classname SimpleException
 * @Description TODO
 * @create 2019/4/23
 */
public class SimpleException extends Throwable {
    private String errMsg;

    public SimpleException(@NotNull @Nls String errMsg) {
        super(errMsg);
    }
}
