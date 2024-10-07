package com.colak.springtutorial.transformer;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component("transformer")
public class Transformer {

    public Message<String> transformToSecondCall(Message<String> message){

        String payload = message.getPayload();
        String newPayload = payload + "19";

        return MessageBuilder.withPayload(newPayload).copyHeaders(message.getHeaders()).build();
    }
}
