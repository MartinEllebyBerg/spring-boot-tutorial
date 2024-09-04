package com.example.springboottutorial.repository;

import com.example.springboottutorial.model.Message;

import java.util.ArrayList;
import java.util.List;

public class WelcomeRepository {
    private int messageID = 1;
    private final List<Message> messages = new ArrayList<>();

    public WelcomeRepository() {
        populateMessages();
    }

    public List<Message> getAllMessages() {
        return messages;
    }
}
