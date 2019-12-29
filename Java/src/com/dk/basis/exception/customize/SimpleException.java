package com.dk.basis.exception.customize;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

/**
 * @author DingKai
 * @version 1.0
 */
public class SimpleException extends Throwable {
    private String errMsg;

    public SimpleException(@NotNull @Nls String errMsg) {
        super(errMsg);
    }
}
