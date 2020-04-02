package com.tecacet.actionspoc;

import redis.clients.jedis.Jedis;

public class JedisCache {

    private final Jedis jedis = new Jedis("localhost", 6379);

    public void put(String name, String value) {
        jedis.set(name, value);
    }

    public String get(String name) {
        return jedis.get(name);
    }

    public String ping() {
        return jedis.ping("I am up!");
    }
}
