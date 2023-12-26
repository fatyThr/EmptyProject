package com.example.emptyproject.application.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Client Api",
        description = "Rest API for CRUD operation")
@RestController
@RequestMapping("/api")
public class ClientController {
    @GetMapping("/hello/{person}")
    public ResponseEntity<String> getClient(@PathVariable String person) {
        return ResponseEntity.ok(String.format("Hello %s , are you fine?", person));
    }
}
