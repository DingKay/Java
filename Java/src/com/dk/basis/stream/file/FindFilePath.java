package com.dk.basis.stream.file;

import org.jetbrains.annotations.Nullable;

import java.io.*;
import java.util.Scanner;

/**
 *    To find Tim QQ then open it.
 *    Change : One Thread per Disk To Scanning
 * @author DingKai
 *
 */
public class FindFilePath {
    private static String search = null;
    private boolean flag;
    private static String findPath = "C:\\Users\\dk\\Desktop\\findPath.txt";

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Nullable
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

    /**
     * recursive method to find file
     * @author DingKai
     * @param path app path
     * @throws java.io.IOException path incorrect
     */
    private void inPath(String path) throws IOException {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files !=null) {
            for (File f : files) {
                inPath(f.getPath());
            }
        }else {
//            if (path.toLowerCase().contains(search+".exe")) {
            String[] split = path.toLowerCase().split("\\\\");
            if (split[split.length-1].equals(search + ".exe")) {
                System.out.println("Find it");
                System.out.println(path);
                ProcessBuilder processBuilder = new ProcessBuilder(path);
                processBuilder.start();
                FileOutputStream fileOutputStream = new FileOutputStream(new File(findPath),true);
                fileOutputStream.write((path + "\r\n").getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
                setFlag(true);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the app you wish to open:");
        Scanner scanner = new Scanner(System.in);
        search = scanner.next();
        FindFilePath findFilePath = new FindFilePath();
        File[] roots = File.listRoots();
        for (int i =0; i < roots.length; i++) {
            System.out.println(roots[i].toString().split(":")[0] + "盘");
            System.out.println("Unused:" + roots[i].getFreeSpace()/1024/1024/1024 + "GB");
            System.out.println("Used:" + (roots[i].getTotalSpace() - roots[i].getFreeSpace())/1024/1024/1024 + "GB");
            System.out.println("total capacity:" + roots[i].getTotalSpace()/1024/1024/1024 + "GB");
            String string = findFilePath.getFile(roots[i].getPath() + "\\");
        }
        if (findFilePath.isFlag()) {
            System.out.println("Sorry Not Found!");
        }
    }
}
