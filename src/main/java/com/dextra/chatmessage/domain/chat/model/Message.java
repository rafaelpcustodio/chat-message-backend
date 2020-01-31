package com.dextra.chatmessage.domain.chat.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="MESSAGE")
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="CONTENT")
    private String content;

    @Column(name="TIMESTAMP")
    private LocalDateTime dateTime;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;

    @ManyToOne
    @JoinColumn(name="fk_chat")
    private Chat chat;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
