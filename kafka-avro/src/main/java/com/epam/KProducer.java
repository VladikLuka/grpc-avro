package com.epam;

import com.epam.avro.Greeting;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.LocalDate;
import java.util.Properties;

public class KProducer {

    private final KafkaProducer<String, Greeting> kafkaProducer;
    private final String topic;

    public KProducer(String topic, String kafkaServer, String schemaRegistry) {
        this.topic = topic;
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServer);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        props.put("schema.registry.url", schemaRegistry);
        kafkaProducer = new KafkaProducer<>(props);
    }

    public void produce(){
        Greeting hello = Greeting
                .newBuilder()
                .setGreet("hello")
                .setTime(System.currentTimeMillis())
                .build();

        ProducerRecord<String, Greeting> greetingRecord = new ProducerRecord<>(topic, "greeting", hello);

        kafkaProducer.send(greetingRecord);
    }

    public void shutDown(){
        kafkaProducer.close();
    }
}
