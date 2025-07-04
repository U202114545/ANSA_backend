package com.ansacontratistas.backend.dto;

import java.util.List;

public class PropertyResponse {
    private Long id;
    private String title;
    private String image;
    private int price;
    private int beds;
    private int baths;
    private int area;
    private String summary;
    private List<String> tags;
    private LocationResponse location;

    public PropertyResponse(Long id, String title, String image, int price, int beds, int baths,
                            int area, String summary, List<String> tags, LocationResponse location) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.beds = beds;
        this.baths = baths;
        this.area = area;
        this.summary = summary;
        this.tags = tags;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public int getBeds() {
        return beds;
    }

    public int getBaths() {
        return baths;
    }

    public int getArea() {
        return area;
    }

    public String getSummary() {
        return summary;
    }

    public List<String> getTags() {
        return tags;
    }

    public LocationResponse getLocation() {
        return location;
    }
}
