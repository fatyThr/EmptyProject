package com.example.emptyproject.application.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Client Api",
        description = "Rest API for CRUD operation")
@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/clients")
public class ClientController {
    @GetMapping("/hello/{person}")
    public ResponseEntity<String> getClient(@PathVariable String person) {
        return ResponseEntity.ok(String.format("Hello %s , are you fine?", person));
    }
}
