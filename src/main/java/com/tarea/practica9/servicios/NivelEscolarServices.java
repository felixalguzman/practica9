package com.tarea.practica9.servicios;

import com.tarea.practica9.entidades.NivelEscolar;
import com.tarea.practica9.repositorio.NivelEscolarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NivelEscolarServices {

    @Autowired
    private NivelEscolarRepository nivelEscolarRepository;

    /**
     *
     * @param nivelEscolar
     * @return
     */
    @Transactional
    public NivelEscolar crearNivelEscolar(NivelEscolar nivelEscolar){
        nivelEscolarRepository.save(nivelEscolar);
        return nivelEscolar;
    }

    public List<NivelEscolar> listaNivelEscolar(){
        return  nivelEscolarRepository.findAll();
    }
}
