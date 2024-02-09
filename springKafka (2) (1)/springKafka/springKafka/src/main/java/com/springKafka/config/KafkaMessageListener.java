package com.springKafka.config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener
{
    Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);



    @KafkaListener(topics = "NewTo0pic", groupId = "NewGroup-2")
    public void consume(String employe)
    {
        logger.info("consumer consume the message {}", employe);
    }
}
