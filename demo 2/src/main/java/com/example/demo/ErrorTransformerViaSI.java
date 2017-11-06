package com.example.demo;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import static com.example.demo.ErrorTransformerViaSCS.ERROR_CHANNEL;

@Service
public class ErrorTransformerViaSI {

    @ServiceActivator(inputChannel=ERROR_CHANNEL, outputChannel="customDlqTopic")
    public ErrorWrapper onError(Message message) {
        return new ErrorWrapper();
    }
}
