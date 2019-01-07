package com.dk.enumerate;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/**
 * @author DingKai
 * @Classname EnumUtils
 * @Description To Learn Enumerate 7:Common Tool Methods
 * @create 2019/1/7
 */
public class EnumUtils {
    enum Color{
        RED,BLUE,YELLOW
    }

    public static void main(String[] args) {
        //Enumerate Default Inherit Class Enum
        System.out.println("Enumerate Instance Of Class Enum: \n" + String.valueOf(
                Color.class.getSuperclass() == Enum.class));
        boolean flag = Color.RED instanceof Enum ? true : false;
        System.out.println("flag = " + flag);

        //Enumerate Default 'name' And 'ordinal' Attributes,'ordinal' Start With Zero
        System.out.println("\nEnumerate Attribute:");
        System.out.println("name:" + Color.BLUE.name() + "\tordinal:" + Color.BLUE.ordinal());
        System.out.println("name:" + Color.YELLOW.name() + "\tordinal:" + Color.YELLOW.ordinal());

        //instance
        Color color = Enum.valueOf(Color.class,"BLUE");
        System.out.println("\nnewInstance:");
        System.out.println(color == Color.BLUE);

        color = Color.valueOf("YELLOW");
        System.out.println(color == Color.YELLOW);

        try {
            color = Color.valueOf("red");
        } catch (IllegalArgumentException e) {
            System.out.println("\nUse String To New Instance,This String Must Be Defined At First,Otherwise: Exception");
            e.printStackTrace();
            try {
                Thread.sleep(0);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        System.out.println(String.valueOf(color == Color.RED) + "\n");

        //Foreach Enumerate
        Color[] colors = Color.values();
        for (Color c : colors) {
            System.out.println("c = " + c);
        }

        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        for (Color c :
                enumSet) {
            System.out.println("c = " + c.ordinal());
        }

        //Range Of EnumSet
        EnumSet<Color> enumSet1 = EnumSet.range(Color.BLUE,Color.YELLOW);
        System.out.println("enumSetRange = " + enumSet1);

        //Enumerate EnumMap
        EnumMap<Color,String> enumMap = new EnumMap<Color, String>(Color.class);
        enumMap.put(Color.RED,"redredred");
        enumMap.put(Color.BLUE,"blueblueblue");
        enumMap.put(Color.YELLOW,"yellowyellowyellow");
        for (Map.Entry<Color, String> colorStringEntry:
        enumMap.entrySet()){
            System.out.println(colorStringEntry.getKey() + " : " + colorStringEntry.getValue());
        }
    }
}
