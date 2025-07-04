package com.ansacontratistas.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ContactMessageResponse {
    private String name;
    private String email;
    private String message;
}
