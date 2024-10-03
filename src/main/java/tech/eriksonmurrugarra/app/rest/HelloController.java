package tech.eriksonmurrugarra.app.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<HelloMessageDto> hello() {
        return ResponseEntity.ok(new HelloMessageDto("Hello World From Server!"));
    }
}
