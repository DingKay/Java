package com.dk.basis.exception.test;

import com.dk.util.Out;
import com.dk.basis.exception.customize.SimpleException;
import org.jetbrains.annotations.Contract;

/**
 * customize exception
 * @author DingKai
 * @version 1.0
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
            Out.print("the following is customize com.dk.basis.exception");
            test.simpleExceptionTest();
        } catch (SimpleException e) {
            e.printStackTrace();
            Out.print("catch it!");
        }
    }

    /**
     * customize com.dk.basis.exception: SimpleException to test method
     * @author DingKai
     * @throws SimpleException
     */
    @Contract(" -> fail")
    private void simpleExceptionTest() throws SimpleException{
        throw new SimpleException("customize com.dk.basis.exception");
    }
}
