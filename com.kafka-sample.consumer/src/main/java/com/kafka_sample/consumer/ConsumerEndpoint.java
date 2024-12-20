package com.kafka_sample.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsumerEndpoint {
    @KafkaListener(groupId = "group_a", topics = "topic1")
    public void consumerFromGroupA(String msg) {
        log.info("ConsumerFromGroupA: {}", msg);
    }

    @KafkaListener(groupId = "group_b", topics = "topic1")
    public void consumerFromGroupB(String msg) {
        log.info("ConsumerFromGroupB: {}", msg);
    }

    @KafkaListener(groupId = "group_c", topics = "topic2")
    public void consumerFromGroupC(String msg) {
        log.info("ConsumerFromGroupC: {}", msg);
    }

    @KafkaListener(groupId = "group_c", topics = "topic3")
    public void consumerFromGroupD(String msg) {
        log.info("ConsumerFromGroupD: {}", msg);
    }

    @KafkaListener(groupId = "group_d", topics = "topic4")
    public void consumerFromGroupE(String msg) {
        log.info("ConsumerFromGroupE: {}", msg);
    }
}
