package com.ansacontratistas.backend.repository;

import com.ansacontratistas.backend.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
    // Aquí puedes agregar métodos personalizados si lo necesitas más adelante
}
