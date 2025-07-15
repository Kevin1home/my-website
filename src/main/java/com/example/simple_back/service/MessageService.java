package com.example.simple_back.service;
import com.example.simple_back.model.Message;
import com.example.simple_back.storage.MessageStorage;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
@Getter
public class MessageService {

    private final MessageStorage messageStorage;

    public MessageService(MessageStorage messageStorage) {
        this.messageStorage = messageStorage;
    }

    public Message createMessage(Message message) {
        return messageStorage.save(message);
    }

    public List<Message> getAllMessages() {
        return messageStorage.findAll();
    }
}
