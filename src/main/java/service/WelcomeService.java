package service;

import com.example.springboottutorial.model.Message;
import com.example.springboottutorial.repository.WelcomeRepository;

import java.util.List;

public class WelcomeService {
    private final WelcomeRepository welcomeRepository;

     public WelcomeService(WelcomeRepository welcomeRepository) {
         this.welcomeRepository = welcomeRepository;
     }

     public List<Message> getAllMessages() {
         return welcomeRepository.getAllMessages();
     }
}
