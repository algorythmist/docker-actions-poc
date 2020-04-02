package com.tecacet.redis;

import org.junit.jupiter.api.Test;

import redis.clients.jedis.Jedis;

public class RedisConnectionTest {

    @Test
    public void connect() {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server successfully");
        //check whether server is running or not
        System.out.println("Server is running: "+jedis.ping());


    }
}
