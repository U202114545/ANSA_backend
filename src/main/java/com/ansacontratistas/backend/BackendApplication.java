package com.ansacontratistas.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
        System.out.println("🚀 ANSA Backend iniciado correctamente en http://localhost:8080");
        System.out.println("📘 Swagger UI disponible en: http://localhost:8080/swagger-ui.html");
    }
}

