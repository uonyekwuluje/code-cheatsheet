package com.tutorial.kafka.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.config.TopicBuilder;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Configuration
@SpringBootApplication
@RestController
public class KafkaTopicConfig {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapAddress;

    
    //@Bean 
    //public KafkaAdmin admin() {
    //   return new KafkaAdmin(Map.of(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress));
    //}

    @GetMapping("/topic")
    public String hello(@RequestParam(value = "name", defaultValue = "spapptpc") String name) {
       return String.format("Hello %s!", name);
    }

    // Create Topic
    // NewTopic from kafka admin clients package
    @Bean
    public NewTopic topicIntro() {
        final NewTopic topic = TopicBuilder.name("sapp")
           .partitions(3)
           .replicas(1)
           .build();

        return topic;
    }

}
