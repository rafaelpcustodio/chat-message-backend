package com.dextra.chatmessage.application.controller;

import com.dextra.chatmessage.domain.chat.model.Chat;
import com.dextra.chatmessage.domain.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private ChatService chatService;

    public List<Chat> getChats(@RequestParam(value="user_id") Long id) {
        return chatService.findAllById(id);
    }

}
