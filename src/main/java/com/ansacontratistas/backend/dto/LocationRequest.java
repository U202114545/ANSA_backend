package com.ansacontratistas.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LocationRequest {
    // Getters y setters
    private String address;
    private double latitude;
    private double longitude;

}
