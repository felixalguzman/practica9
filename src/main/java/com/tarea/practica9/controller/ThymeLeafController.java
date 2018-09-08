package com.tarea.practica9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller() //indica que es un controlador.
//@RequestMapping(path = "/thymeleaf")
public class ThymeLeafController {


    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("titulo", "Bienvenido");

        return "/thymeleaf/index";
        
    }

    
}