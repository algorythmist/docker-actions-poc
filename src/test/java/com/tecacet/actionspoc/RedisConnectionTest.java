package com.tecacet.actionspoc;



import static org.junit.Assert.assertEquals;

import com.tecacet.actionspoc.JedisCache;

import org.junit.Test;

public class RedisConnectionTest {

    @Test
    public void connect() {
        //Connecting to Redis server on localhost
        JedisCache jedisCache = new JedisCache();
        System.out.println("Connection to server successfully");
        //check whether server is running or not
        assertEquals("I am up!", jedisCache.ping());
    }

}
