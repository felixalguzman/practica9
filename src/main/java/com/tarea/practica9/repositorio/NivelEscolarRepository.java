package com.tarea.practica9.repositorio;

import com.tarea.practica9.entidades.NivelEscolar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * NivelEscolarRepository
 *
 */
@Repository
public interface NivelEscolarRepository extends JpaRepository<NivelEscolar, Long> {



//    List<NivelEscolar> findAll();
    

    
}