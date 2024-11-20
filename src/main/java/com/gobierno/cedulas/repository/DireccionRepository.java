package main.java.com.gobierno.cedulas.repository;

import com.gobierno.cedulas.model.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {
}
