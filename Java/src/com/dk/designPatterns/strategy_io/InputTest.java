package com.dk.designPatterns.strategy_io;

import java.io.*;

/**
 * @author DingKai
 * @Classname InputTest
 * @Description TODO
 * @create 2019/2/22
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream lcis = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream("C:\\Users\\dk\\Desktop\\test.txt")));
            while ((c = lcis.read()) >= 0){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
