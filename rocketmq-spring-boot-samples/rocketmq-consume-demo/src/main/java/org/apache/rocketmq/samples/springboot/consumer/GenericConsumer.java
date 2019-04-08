package org.apache.rocketmq.samples.springboot.consumer;

import org.apache.rocketmq.samples.springboot.domain.GenericEvent;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 *  generic consumer
 */
@RocketMQMessageListener(consumerGroup = "ggg", topic = "sss")
@Component
public class GenericConsumer implements RocketMQListener<GenericEvent<String>> {
    @Override
    public void onMessage(GenericEvent<String> message) {
        System.out.println("GenericConsumer.onMessage");
    }
}
