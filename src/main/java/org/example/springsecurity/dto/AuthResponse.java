package org.example.springsecurity.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthResponse {
    // Getters and Setters
    private String token;
    private String message;
    private String username;

    // Constructors
    public AuthResponse() {
    }

    public AuthResponse(String token, String message, String username) {
        this.token = token;
        this.message = message;
        this.username = username;
    }

}
