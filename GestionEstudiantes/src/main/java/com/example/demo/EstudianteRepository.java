package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    // Este método buscará estudiantes cuyo nombre contenga el texto ingresado
    List<Estudiante> findByNombreContainingIgnoreCase(String nombre);
}