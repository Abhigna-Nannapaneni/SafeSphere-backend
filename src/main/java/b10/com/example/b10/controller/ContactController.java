package b10.com.example.b10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import b10.com.example.b10.Models.ContactMessage;
import b10.com.example.b10.repository.ContactMessageRepository;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactMessageRepository contactRepository;

    @PostMapping
    public ResponseEntity<String> submitContact(@RequestBody ContactMessage message) {
        // Save to database
        contactRepository.save(message);

        return ResponseEntity.ok("Message received! We'll contact you soon.");
    }
}
