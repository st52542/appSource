package fei.upce.appsource.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generic")
public class GenericController {
    @GetMapping("/ping")
    @PreAuthorize("hasRole('READER') or hasRole('FULL') or hasRole('ADMIN')")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok().body("running");
    }
}
