package org.shounak.hellospring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<String> helloController() {
        return ResponseEntity.ok("Everything is working Perfectly Fine!");
    }
}
