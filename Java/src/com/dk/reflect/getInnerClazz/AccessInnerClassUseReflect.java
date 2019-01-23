package com.dk.reflect.getInnerClazz;

/**
 * @author DingKai
 * @Classname AccessInnerClassUseReflect
 * @Description TODO
 * @create 2019/1/23
 */
public class AccessInnerClassUseReflect {
    public static void main(String[] args) {
        Class clazz = InnerContainer.class;
        clazz.getDeclaredClasses();
    }
}
