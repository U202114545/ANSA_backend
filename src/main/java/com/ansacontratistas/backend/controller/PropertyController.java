package com.ansacontratistas.backend.controller;

import com.ansacontratistas.backend.dto.PropertyRequest;
import com.ansacontratistas.backend.entity.Location;
import com.ansacontratistas.backend.entity.Property;
import com.ansacontratistas.backend.service.PropertyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
@CrossOrigin(origins = "*")
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping
    public List<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Property> getPropertyById(@PathVariable Long id) {
        return propertyService.getPropertyById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Property createProperty(@RequestBody PropertyRequest request) {
        // Convertimos el DTO a entidad Property
        Location location = new Location();
        location.setAddress(request.getLocation().getAddress());
        location.setLatitude(request.getLocation().getLatitude());
        location.setLongitude(request.getLocation().getLongitude());

        Property property = new Property();
        property.setTitle(request.getTitle());
        property.setImage(request.getImage());
        property.setPrice(request.getPrice());
        property.setBeds(request.getBeds());
        property.setBaths(request.getBaths());
        property.setArea(request.getArea());
        property.setSummary(request.getSummary());
        property.setTags(request.getTags());
        property.setLocation(location);

        return propertyService.saveProperty(property);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
        return ResponseEntity.noContent().build();
    }
}
