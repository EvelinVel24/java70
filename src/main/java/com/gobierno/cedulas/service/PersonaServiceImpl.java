package main.java.com.gobierno.cedulas.service;

import com.gobierno.cedulas.model.Persona;
import com.gobierno.cedulas.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }
}
