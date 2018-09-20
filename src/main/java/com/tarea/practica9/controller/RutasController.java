package com.tarea.practica9.controller;

import com.tarea.practica9.entidades.Encuesta;
import com.tarea.practica9.repositorio.NivelEscolarRepository;
import com.tarea.practica9.servicios.EncuestaServices;
import com.tarea.practica9.servicios.NivelEscolarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller() //indica que es un controlador.
//@RequestMapping(path = "/thymeleaf")
public class RutasController {

    @Autowired
    private NivelEscolarServices nivelEscolarServices;

    @Autowired
    private EncuestaServices encuestaServices;

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("titulo", "Oficina de Planeamiento");
        return "/thymeleaf/index";
        
    }

    @RequestMapping("/encuesta")
    public String encuesta(Model model) {

        model.addAttribute("niveles",nivelEscolarServices.listaNivelEscolar());

        return "/thymeleaf/encuesta";
        
    }

    @RequestMapping("/resultados")
    public String resultados(Model model){
        model.addAttribute("encuestas", encuestaServices.obtenerEncuestas());
        return "/thymeleaf/resultados";
    }

    @RequestMapping(value = "/sincronizar", method = RequestMethod.POST)
    public ResponseEntity<List<Encuesta>> sincronizar(@RequestBody List<Encuesta> encuestaList){

        for (Encuesta encuesta: encuestaList) {
            encuestaServices.insertarEncuesta(encuesta);
        }

        return new ResponseEntity<>(encuestaList, HttpStatus.OK);
    }


}