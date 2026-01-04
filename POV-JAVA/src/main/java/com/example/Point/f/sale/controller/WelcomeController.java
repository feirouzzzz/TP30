package com.example.pos.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Spring Boot service is up and running 🚀";
    }

    @GetMapping("/clients")
    public String listClients() {
        return "Clients endpoint";
    }

    @GetMapping("/about")
    public String showAbout() {
        return "Application presentation";
    }
}
