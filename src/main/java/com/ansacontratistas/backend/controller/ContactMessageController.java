package com.ansacontratistas.backend.controller;

import com.ansacontratistas.backend.dto.ContactMessageRequest;
import com.ansacontratistas.backend.dto.ContactMessageResponse;
import com.ansacontratistas.backend.entity.ContactMessage;
import com.ansacontratistas.backend.service.ContactMessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactMessageController {

    private final ContactMessageService contactMessageService;

    public ContactMessageController(ContactMessageService contactMessageService) {
        this.contactMessageService = contactMessageService;
    }

    @GetMapping
    public List<ContactMessageResponse> getAllMessages() {
        return contactMessageService.getAllMessages()
                .stream()
                .map(m -> new ContactMessageResponse(
                        m.getFullName(),   // Corregido
                        m.getEmail(),
                        m.getMessage()
                ))
                .collect(Collectors.toList());
    }

    @PostMapping
    public ContactMessageResponse sendMessage(@RequestBody ContactMessageRequest request) {
        ContactMessage message = new ContactMessage();
        message.setFullName(request.getName());  // Corregido
        message.setEmail(request.getEmail());
        message.setMessage(request.getMessage());

        ContactMessage saved = contactMessageService.saveMessage(message);

        return new ContactMessageResponse(
                saved.getFullName(),  // Corregido
                saved.getEmail(),
                saved.getMessage()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable Long id) {
        contactMessageService.deleteMessage(id);
        return ResponseEntity.noContent().build();
    }
}
