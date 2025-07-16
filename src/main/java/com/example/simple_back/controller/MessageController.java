package com.example.simple_back.controller;

import com.example.simple_back.model.Message;
import com.example.simple_back.service.MessageService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/messages")
@Setter
@Getter
@Slf4j
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/message")
    public Message createMessage(@RequestBody Message message) {
        log.info("createMessage Request");
        return messageService.createMessage(message);
    }

    @GetMapping("/all")
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

}
