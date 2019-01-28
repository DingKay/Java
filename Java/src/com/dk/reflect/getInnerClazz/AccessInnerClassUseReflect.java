package com.dk.reflect.getInnerClazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author DingKai
 * @Classname AccessInnerClassUseReflect
 * @Description TODO
 * @create 2019/1/23
 */
@SuppressWarnings({"unchecked",""})
public class AccessInnerClassUseReflect {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class clazz = InnerContainer.class;
        Class[] declaredClasses = clazz.getDeclaredClasses();
        for (Class declaredClass : declaredClasses) {
            int modifiers = declaredClass.getModifiers();
            if (Modifier.toString(modifiers).contains("static")){
                Object o = declaredClass.newInstance();
                Field declaredField = declaredClass.getDeclaredField("field");
                declaredField.setAccessible(true);
                System.out.println(declaredField.get(o));
            }else{
                Constructor declaredConstructor = declaredClass.getDeclaredConstructor(clazz);
                declaredConstructor.setAccessible(true);
                Object o = declaredConstructor.newInstance(clazz.newInstance());
                Field field = declaredClass.getDeclaredField("field");
                field.setAccessible(true);
                System.out.println(field.get(o));
            }
        }
        Field field = clazz.getDeclaredField("field");
        field.setAccessible(true);
        Runnable o = (Runnable)field.get(clazz.newInstance());
        o.run();
    }
}
