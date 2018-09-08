package com.tarea.practica9.controller;

import com.tarea.practica9.repositorio.NivelEscolarRepository;
import com.tarea.practica9.servicios.NivelEscolarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller() //indica que es un controlador.
//@RequestMapping(path = "/thymeleaf")
public class ThymeLeafController {

    @Autowired
    NivelEscolarRepository nivelEscolarRepository;

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("titulo", "Oficina de Planeamiento");
        
        return "/thymeleaf/index";
        
    }

    @RequestMapping("/encuesta")
    public String encuesta(Model model) {

        model.addAttribute("niveles",nivelEscolarRepository.findAll());

        return "/thymeleaf/encuesta";
        
    }

    
}