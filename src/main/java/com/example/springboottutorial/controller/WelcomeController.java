package com.example.springboottutorial.controller;

import com.example.springboottutorial.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import service.WelcomeService;

import java.util.List;

public class WelcomeController {
    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("")
    public ResponseEntity<List<Message>> getAllMessages() {
        List<Message> messages = welcomeService.getAllMessages();
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }
}
