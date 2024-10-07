package com.colak.springtutorial.producer;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface MessageProducer {

    @Gateway(requestChannel = "inputExternalChannel", replyChannel = "outputExternalChannel")
    String externalCall(String payload);
}
