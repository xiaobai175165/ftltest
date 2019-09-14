package com.kgc.Test;

import com.kgc.common.JedisCofig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Test {
    public static void main(String[] args) {
        Jedis jedis= JedisCofig.jedisPool();
        jedis.set("hello","你好");
        System.out.println(jedis.get("hello"));
    }
}
