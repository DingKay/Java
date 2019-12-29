package com.dk.basis.enumerate;

/**
 * To Learn Enumerate 5:Class Enumerate Can Implements An Interface
 * @author DingKai
 * @version 1.0
 */
public class ImpInterfaceEnum {
    interface InterEnum{
        /**
         * output
         */
        void print();
        /**
         * obtain
         * @return java.lang.String
         */
        String getInfo();
    }
    enum Color implements InterEnum{
        /**
         * this is comment
         */
        YELLOW("yellow",1);

        Color(String name,int index){
            this.name = name;
            this.index = index;
        }
        private int index;
        private String name;

        public int getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        /**
         * Interface Methods
         */
        @Override
        public void print() {
            System.out.println(this.getIndex() +":"+ this.getName());
        }

        @Override
        public String getInfo() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Color.YELLOW.print();
        System.out.println(Color.YELLOW.getInfo());
    }
}
