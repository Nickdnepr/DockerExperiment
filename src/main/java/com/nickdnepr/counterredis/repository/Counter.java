package com.nickdnepr.counterredis.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@RedisHash("Counter")
public class Counter {

    public static final String count_id = "Count";

    @Id
    private String id;
    private int visits;

    public Counter(String id, int visits) {
        this.id = id;
        this.visits = visits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }
}
