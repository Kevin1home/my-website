package com.example.simple_back.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "message", schema = "public")
@Getter @Setter @ToString @EqualsAndHashCode
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "text")
    String text;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

}
