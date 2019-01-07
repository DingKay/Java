package com.dk.enumerate;

/**
 * @author DingKai
 * @Classname MethodEnum
 * @Description To Learn Enumerate 3:Add Methods In Enumerate Class
 *              If U Wanna Add Some Customize Methods
 *              Then Must Definition Enumerate Attribute At First
 *              And The Constructor Default 'Private'
 * @create 2019/1/4
 */
public enum MethodEnum {
    //Enumerate Constant
    RED("red",1),
    GREEN("green",2),
    BLUE("blue",3);

    //Attribute
    private String name;
    private int index;

    //Get/Set
    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    //Constructor
    MethodEnum(String name,int index){
        this.name = name;
        this.index = index;
    }

    //Normal Method
    public static String getName(int index){
        for (MethodEnum methodEnum : MethodEnum.values()){
            if (index == methodEnum.getIndex())
                return methodEnum.name;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getName(1));
        System.out.println(MethodEnum.GREEN.getName());
        System.out.println(MethodEnum.BLUE.getIndex());
    }
}
