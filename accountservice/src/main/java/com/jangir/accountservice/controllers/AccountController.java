package com.jangir.accountservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/greet")
    public String greeting() {
        return "Hello New User";
    }
}
