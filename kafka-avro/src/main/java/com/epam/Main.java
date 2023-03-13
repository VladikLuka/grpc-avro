package com.epam;

import org.apache.kafka.clients.admin.*;

import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String topic = "avro-kafka";
        String schemaRegistry = "http://localhost:8081";
        String kafkaServer = "localhost:9092";

        KProducer producer = new KProducer(topic, kafkaServer, schemaRegistry);
        KConsumer consumer = new KConsumer(topic, kafkaServer, schemaRegistry);

        createNewTopic(topic, kafkaServer);

        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        try {
            executor.scheduleAtFixedRate(producer::produce, 0, 1, TimeUnit.SECONDS);
            consumer.consume();
        } catch (Throwable throwable){
            throwable.printStackTrace();
        } finally {
            producer.shutDown();
        }
    }

    public static void createNewTopic(String topicName, String kafkaServer) throws ExecutionException, InterruptedException {
        Properties props = new Properties();
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServer);
        Admin admin = Admin.create(props);
        ListTopicsResult listTopicsResult = admin.listTopics();
        if (!listTopicsResult.names().get().contains(topicName)) {
            CreateTopicsResult topics = admin.createTopics(List.of(new NewTopic(topicName, 1, (short) 1)));

            topics.values().get(topicName)
                    .get();
        }
    }
}
