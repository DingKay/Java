package com.dk.design_patterns.decorate_io;

import java.io.*;

/**
 * @author DingKai
 * @Classname InputTest
 * @Description Java I/O package used decorate patterns;
 *              We can extends FilterInputStream to easy-use java I/O package and
 *              Expansion this.
 * @create 2019/2/22
 */
public class InputTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\dk\\Desktop\\test.txt";
        int c;
        try {
            /*Lowercase*/
            InputStream lcis = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream(path)));
            while ((c = lcis.read()) >= 0){
                System.out.print((char)c);
            }
            /*Uppercase*/
            lcis = new UpperCaseInputStream(new BufferedInputStream(
                    new FileInputStream(path)));
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
