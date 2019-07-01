package com.dk.redis;

import redis.clients.jedis.Jedis;

/**
 * @author DingKai
 * @version 1.0
 * @date 2019/7/1
 */
public class RedisJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println("服务器正在运行:" + jedis.ping());
    }
}
