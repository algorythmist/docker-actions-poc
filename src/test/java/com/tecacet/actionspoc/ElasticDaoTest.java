package com.tecacet.actionspoc;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class ElasticDaoTest {

    @Test
    public void checkElasticStatus() throws IOException {
        ElasticDao elasticDao = new ElasticDao();
        assertEquals("GREEN", elasticDao.checkElasticStatus());

    }
}
