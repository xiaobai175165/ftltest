package com.kgc.common;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JedisCofig {


    public  JedisPool getJedisPool() {
        return jedisPool;
    }

    public  void setJedisPool(JedisPool jedisPool) {
        JedisCofig.jedisPool = jedisPool;
    }

    private static JedisPool jedisPool;
 /*   static {
        InputStream in=JedisCofig.class.getClassLoader().getResourceAsStream("jedis.properties");
        Properties pro=new Properties();
        try {
            pro.load(in);

        } catch (IOException e) {
            e.printStackTrace();
        }
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));
        config.setMaxIdle(Integer.parseInt(pro.getProperty("maxIdle")));
        jedisPool=new JedisPool(config,pro.getProperty("host"),Integer.parseInt(pro.getProperty("port")));



    }*/
    public static Jedis jedisPool(){
        return jedisPool.getResource();
    }

    public static void close(Jedis jedis){
        jedis.close();
    }

}
