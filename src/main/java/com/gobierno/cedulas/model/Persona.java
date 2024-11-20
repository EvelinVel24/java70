package main.java.com.gobierno.cedulas.model;

import jakarta.persistence.*;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rut;
    private String nombres;
    private String apellidos;
    private String fecha;
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    private Direccion direccion;

    // Getters y Setters
}
