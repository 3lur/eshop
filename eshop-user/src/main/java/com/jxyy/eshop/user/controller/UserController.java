package com.jxyy.eshop.user.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    @GetMapping("/api/v1/userInfo")
    public ResponseEntity<?> userInfo() {
        return ResponseEntity.ok("user info");
    }
}
