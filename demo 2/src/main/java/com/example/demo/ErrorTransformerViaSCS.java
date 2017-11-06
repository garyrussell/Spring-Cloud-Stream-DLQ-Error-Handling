package com.example.demo;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;

import static com.example.demo.CustomDlqMessageChannel.CUSTOM_DLQ_TOPIC;

@EnableBinding(Processor.class)
public class ErrorTransformerViaSCS {
    public static final String ERROR_CHANNEL = "errorChannel";

    @StreamListener(ERROR_CHANNEL)
    @SendTo(CUSTOM_DLQ_TOPIC)
    public ErrorWrapper onError(Message message) {
        return new ErrorWrapper();
    }
}

