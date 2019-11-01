package com.nickdnepr.counterredis.controller;

import com.nickdnepr.counterredis.repository.Counter;
import com.nickdnepr.counterredis.repository.CounterRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@ComponentScan(value = "com.nickdnepr")
public class Controller {

    private CounterRepository repository;

    public Controller(CounterRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/")
    public String count() {
        Optional<Counter> optionalCounter = repository.findById(Counter.count_id);
        Counter counter;
        if (optionalCounter.isPresent()) {
            counter = optionalCounter.get();
            counter.setVisits(counter.getVisits() + 1);
            repository.save(counter);
        } else {
            counter = new Counter(Counter.count_id,0);
            repository.save(counter);
        }
        return "Current number of visits is " + counter.getVisits();
    }
}
