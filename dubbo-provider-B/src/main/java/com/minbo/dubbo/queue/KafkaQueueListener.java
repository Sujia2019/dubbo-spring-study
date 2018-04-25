package com.minbo.dubbo.queue;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @Author: wei.jiang
 * @Date: Created on 2018/4/25
 */

public class KafkaQueueListener {

    @KafkaListener(id = "t1", topics = "t1")
    public void queueConsumer(ConsumerRecord<?, ?> record) {
        System.out.println(record.value());
    }
}
