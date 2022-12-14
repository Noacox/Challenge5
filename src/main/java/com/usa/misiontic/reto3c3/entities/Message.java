package com.usa.misiontic.reto3c3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="message")
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idMessage;
    @Column(name="messageText" , length = 250, nullable = false)

    private String messageText;


    @ManyToOne
    @JoinColumn(name="messageCloud")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Cloud cloud;
    @ManyToOne
    @JoinColumn(name="messageClient")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
