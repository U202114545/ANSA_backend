package com.ansacontratistas.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContactMessageRequest {
    private String name;
    private String email;
    private String message;
}
