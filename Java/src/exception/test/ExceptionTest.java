package exception.test;

import com.dk.utils.DK;
import exception.customize.SimpleException;
import org.jetbrains.annotations.Contract;

/**
 * @author DingKai
 * @Classname ExceptionTest
 * @Description TODO
 * @create 2019/4/23
 */
public class ExceptionTest {
    static {
        test = new ExceptionTest();
    }

    /**
     * Contract(pure = true) representative this method is pure function
     */
    @Contract(pure = true)
    private ExceptionTest(){}

    private static ExceptionTest test;

    public static void main(String[] args) {
        try {
            DK.print("the following is customize exception");
            test.simpleExceptionTest();
        } catch (SimpleException e) {
            e.printStackTrace();
            DK.print("catch it!");
        }
    }

    /**
     * customize exception: SimpleException to test method
     * @author DingKai
     * @date 2019/4/23
     * @param
     * @return void
     * @exception SimpleException
     */
    @Contract(" -> fail")
    private void simpleExceptionTest() throws SimpleException{
        throw new SimpleException("customize exception");
    }
}
