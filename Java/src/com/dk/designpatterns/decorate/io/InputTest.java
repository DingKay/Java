package com.dk.designpatterns.decorate.io;

import java.io.*;

/**
 *  Java I/O package used decorate patterns;
 *              We can extends FilterInputStream to easy-use java I/O package and
 *              Expansion this.
 * @author DingKai
 * @version 1.0
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
