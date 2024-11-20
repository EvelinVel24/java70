package main.java.com.gobierno.cedulas.service;

import com.gobierno.cedulas.model.Direccion;
import com.gobierno.cedulas.repository.DireccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionServiceImpl implements DireccionService {
    private final DireccionRepository direccionRepository;

    public DireccionServiceImpl(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    @Override
    public Direccion save(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    @Override
    public List<Direccion> findAll() {
        return direccionRepository.findAll();
    }
}
