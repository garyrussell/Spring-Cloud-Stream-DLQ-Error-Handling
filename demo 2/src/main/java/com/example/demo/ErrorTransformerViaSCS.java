package com.example.demo;


import org.springframework.messaging.Message;

//@EnableBinding(Processor.class)
public class ErrorTransformerViaSCS {
    public static final String ERROR_CHANNEL = "errorChannel";

//    @StreamListener(ERROR_CHANNEL)
//    @SendTo(CUSTOM_DLQ_TOPIC)
    public ErrorWrapper onError(Message message) {
        return new ErrorWrapper();
    }
}

