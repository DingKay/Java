package com.dk.api.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author DingKai
 */
public class StreamDemo01 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ding", "wang", "chang", "cha");
        long startTime = System.currentTimeMillis();
        normalFunction(list);
        System.out.println("normalFunction use = " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        List<String> listStream = Arrays.asList("kai", "xiu", "wu", "xu");
        List<String> collect = listStream.stream()
                .filter(item -> item.startsWith("k"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
        System.out.println("stream api use = " + (System.currentTimeMillis() - startTime));
    }

    private static void normalFunction(List<String> list) {
        // 此时的list是Arrays内部ArraysList静态类，未实现remove方法，转换成java.util.ArrayList
        list = new ArrayList<>(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.startsWith("c")) {
                int index = list.indexOf(str);
                list.set(index, str.toUpperCase());
            } else {
                iterator.remove();
            }
        }
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
