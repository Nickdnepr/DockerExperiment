package com.nickdnepr.counterredis.repository;

import org.springframework.data.repository.CrudRepository;

public interface CounterRepository extends CrudRepository<Counter, String> {

}
