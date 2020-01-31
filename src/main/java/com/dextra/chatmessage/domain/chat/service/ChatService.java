package com.dextra.chatmessage.domain.chat.service;

import com.dextra.chatmessage.domain.chat.model.Chat;
import com.dextra.chatmessage.domain.chat.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    public List<Chat> findAllById(final Long id) {
        return chatRepository.findAllById(Collections.singleton(id));
    }
}
