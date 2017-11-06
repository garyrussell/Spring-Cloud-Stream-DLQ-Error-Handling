package com.example.demo;

import static com.example.demo.ErrorTransformerViaSCS.ERROR_CHANNEL;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(CustomDlqMessageChannel.class)
public class ErrorTransformerViaSI {

    @ServiceActivator(inputChannel=ERROR_CHANNEL, outputChannel="customDlqTopic")
    public ErrorWrapper onError(Message message) {
        return new ErrorWrapper();
    }

}

