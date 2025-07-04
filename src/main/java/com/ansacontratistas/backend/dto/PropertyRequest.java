package com.ansacontratistas.backend.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PropertyRequest {
    // Getters y setters
    private String title;
    private String image;
    private int price;
    private int beds;
    private int baths;
    private int area;
    private String summary;
    private List<String> tags;
    private LocationRequest location;

}
