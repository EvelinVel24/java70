package main.java.com.gobierno.cedulas.service;


import com.gobierno.cedulas.model.Persona;
import java.util.List;

public interface PersonaService {
    Persona save(Persona persona);
    List<Persona> findAll();
}
