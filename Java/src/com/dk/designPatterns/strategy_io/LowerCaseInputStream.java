package com.dk.designPatterns.strategy_io;

import org.jetbrains.annotations.NotNull;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author DingKai
 * @Classname LowerCaseInputStream
 * @Description TODO
 * @create 2019/2/21
 */
public class LowerCaseInputStream extends FilterInputStream {
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase(c);
    }

    @Override
    public int read(@NotNull byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + len; i++) {
            b[i] = (byte)Character.toLowerCase(b[i]);
        }
        return result;
    }
}
