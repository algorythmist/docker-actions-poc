package com.tecacet.actionspoc;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.cluster.health.ClusterHealthRequest;
import org.elasticsearch.action.admin.cluster.health.ClusterHealthResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.cluster.health.ClusterHealthStatus;

import java.io.IOException;

public class ElasticDao {

    private final RestHighLevelClient highLevelClient;

    public ElasticDao() {
        RestClientBuilder clientBuilder =
                RestClient.builder(new HttpHost("localhost", 9200, "http"));
        this.highLevelClient = new RestHighLevelClient(clientBuilder);
    }

    public String checkElasticStatus() throws IOException {
        ClusterHealthRequest request = new ClusterHealthRequest();
        String statusString;
        ClusterHealthResponse response = highLevelClient.cluster().health(request, RequestOptions.DEFAULT);
        ClusterHealthStatus status = response.getStatus();
        statusString = status.name();
        return statusString;
    }
}
