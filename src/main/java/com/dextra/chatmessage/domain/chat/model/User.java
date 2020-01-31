package com.dextra.chatmessage.domain.chat.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="CELLPHONE_NUMBER")
    private String cellphoneNumber;

    @Column(name="NAME")
    private String name;

    @ManyToMany
    @JoinTable(
            name="user_chat",
            joinColumns = { @JoinColumn(name="fk_user")},
            inverseJoinColumns = { @JoinColumn(name="fk_chat")}
    )
    private List<Chat> chats;

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }
}
