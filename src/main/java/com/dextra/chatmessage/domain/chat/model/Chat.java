package com.dextra.chatmessage.domain.chat.model;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="CHAT")
public class Chat {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="TITLE")
    private String title;

    @ManyToMany(mappedBy = "chats")
    private Set<User> users;

    @OneToMany
    private List<Message> messages;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
