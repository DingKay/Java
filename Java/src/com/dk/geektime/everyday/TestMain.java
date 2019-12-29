package com.dk.geektime.everyday;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DingKai
 * @version 1.0
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        System.out.println(ordToDoc(new Order()));

        System.out.println(goodsToDoc(new Goods()));

        System.out.println("====");

        System.out.println(ordToDocNew(new Order()));

        System.out.println(ordToDocNew(new Goods()));
    }

    public static Map<String, Object> ordToDoc(Order order) {
        Map<String, Object> resultMap = new HashMap<>(3);
        resultMap.put("goods",order.getGoods());
        resultMap.put("price",order.getPrice());
        resultMap.put("count",order.getCount());
        return resultMap;
    }

    public static Map<String, Object> goodsToDoc(Goods goods) {
        Map<String, Object> resultMap = new HashMap<>(2);
        resultMap.put("goodName",goods.getGoodName());
        resultMap.put("test",goods.getTest());
        return resultMap;
    }

    public static HashMap<String, Object> ordToDocNew(Object obj) throws Exception {
        HashMap<String, Object> resultMap = new HashMap<>(3);
        Field[] declaredFields = obj.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            resultMap.put(field.getName(), field.get(obj));
        }
        return resultMap;
    }
}
