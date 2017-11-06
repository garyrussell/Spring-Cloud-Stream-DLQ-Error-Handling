package com.example.demo;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomDlqMessageChannel {
    String CUSTOM_DLQ_TOPIC = "customDlqTopic";

    @Output(CUSTOM_DLQ_TOPIC)
    MessageChannel customDlqTopic();
}
