package org.example.springsecurity.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityApp {

    @GetMapping("/")
    public String home() {
        return "This is the public home page. Use POST /auth/login to get your JWT token.";
    }

    @GetMapping("/user")
    public String user() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello " + authentication.getName() + "! You are logged in successfully with JWT.";
    }
}