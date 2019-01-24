package com.dk.stream.file;

import java.io.File;
import java.io.IOException;

/**
 * @author DingKai
 * @Classname FindFilePath
 * @Description To find Tim QQ then open it.
 * @create 2019/1/23
 */
public class FindFilePath {
    private String getFile(String path) throws IOException {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                inPath(f.getPath());
            }
        }
        return null;
    }

    private void inPath(String path) throws IOException {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files !=null) {
            for (File f : files) {
                inPath(f.getPath());
            }
        }else {
            if (path.toLowerCase().contains("tim.exe")) {
                System.out.println("Find it");
                System.out.println(path);
                ProcessBuilder processBuilder = new ProcessBuilder(path);
                processBuilder.start();
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        String path = "C:\\";
        FindFilePath findFilePath = new FindFilePath();
//        String string = findFilePath.getFile(path);
//        System.out.println("string = " + string);
        File[] roots = File.listRoots();
        for (int i =0; i < roots.length; i++) {
            String string = findFilePath.getFile(roots[i].getPath() + "\\");
            System.out.println("string = " + string);
        }
    }
}
