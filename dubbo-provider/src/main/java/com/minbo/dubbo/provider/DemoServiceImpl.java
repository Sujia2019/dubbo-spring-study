package com.minbo.dubbo.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class DemoServiceImpl implements DemoService {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public String sayHello(String name) {
        String result = "Welcome to Minbo's Dubbo, Hello " + name;
        kafkaTemplate.send("t1", "test1", result);
        return result;
    }

}
