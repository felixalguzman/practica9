package com.tarea.practica9.servicios;

import com.tarea.practica9.entidades.Encuesta;
import com.tarea.practica9.repositorio.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EncuestaServices {

    @Autowired
    private EncuestaRepository encuestaRepository;

    @Transactional
    public void insertarEncuesta(Encuesta encuesta){
        encuestaRepository.save(encuesta);
    }

    public List<Encuesta> obtenerEncuestas(){
        return encuestaRepository.findAll();
    }
}
