package com.dk.basis.enumerate;

/**
 * To learn Enumerate 4:Override Class Enum toString Method
 * @author DingKai
 * @version 1.0
 */
public class OverrideEnum {
    enum Color{
        /**
         * this is comment
         */
        RED(1,"red"),GREEN(2,"green"),BLUE(3,"blue");

        private String name;
        private int index;

        public String getName() {
            return name;
        }

        public int getIndex() {
            return index;
        }

        Color(int index,String name){
            this.index = index;
            this.name = name;
        }

        @Override
        public String toString() {
            return this.getIndex()+"."+this.getName()+" ";
        }

    }

    public static void main(String[] args) {
        System.out.println(Color.RED);
        System.out.println(Color.GREEN);
        System.out.println(Color.BLUE);
    }
}
