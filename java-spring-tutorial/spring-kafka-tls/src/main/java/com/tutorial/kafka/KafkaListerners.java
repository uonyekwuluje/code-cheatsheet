package com.tutorial.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListerners {

    @KafkaListener(
        topics = "sapp",
        groupId = "groupId"
        )
    void listener(String data){
        System.out.println("Lister Recieved Data => "+data+ ":-)");
    }
}
