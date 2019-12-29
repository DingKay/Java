package com.dk.basis.enumerate;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/**
 * To Learn Enumerate 7:Common Tool Methods
 * @author DingKai
 * @version 1.0
 */
public class EnumUtils {
    enum Color{
        /**
         * this is comment
         */
        RED,BLUE,YELLOW
    }

    public static void main(String[] args) {
        //Enumerate Default Inherit Class Enum
        System.out.println("Enumerate Instance Of Class Enum: \n" + String.valueOf(
                Color.class.getSuperclass() == Enum.class));
        boolean flag = Color.RED instanceof Enum;
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

        //MONDAY ==> 'name'
        System.out.println("\n" + Day.MONDAY.name() + ": " + Day.MONDAY.value);
    }
    enum Day {
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);

        private int value;

        Day(int value) {this.value = value; }

        @Override
        public String toString() {
            switch(this) {
                case FRIDAY:
                    return "Friday: " + value;
                case MONDAY:
                    return "Monday: " + value;
                case SATURDAY:
                    return "Saturday: " + value;
                case SUNDAY:
                    return "Sunday: " + value;
                case THURSDAY:
                    return "Thursday: " + value;
                case TUESDAY:
                    return "Tuesday: " + value;
                case WEDNESDAY:
                    return "Wednesday: " + value;
                default:
                    return null;
            }
        }
    }
}
