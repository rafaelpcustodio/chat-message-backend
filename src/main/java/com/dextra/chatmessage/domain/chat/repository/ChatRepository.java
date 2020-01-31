package com.dextra.chatmessage.domain.chat.repository;

import com.dextra.chatmessage.domain.chat.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}
