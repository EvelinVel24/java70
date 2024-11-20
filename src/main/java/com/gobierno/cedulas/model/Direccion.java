package main.java.com.gobierno.cedulas.model;

import jakarta.persistence.*;

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private String comuna;
    private String region;
    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    // Getters y Setters
}
