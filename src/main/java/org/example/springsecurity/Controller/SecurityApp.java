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
        return """
                <h1>Welcome!</h1>
                <p>This is the public home page.</p>
                <a href='/secure'>Go to Secure Page</a>
                """;
    }

    @GetMapping("/secure")
    public String secure(HttpSession session) {
        return """
                <h1>Protected Page</h1>
                <p>You are logged in successfully.</p>
                <a href='/logout'>Logout</a>
                """;
    }
}
