package org.example.springsecurity.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecurityApp {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApp.class, args);
    }

    @GetMapping("/")
    public String home(HttpSession session) {
        return "This is the public home page.";
    }

    @GetMapping("/user")
    public String user(HttpSession session) {
        return "You are logged in successfully.";
    }
}
