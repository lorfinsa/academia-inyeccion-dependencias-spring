package com.example.controller;

import com.example.domain.Persona;
import com.example.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @Autowired
    PersonaService personaService;

    @GetMapping("/home")
    public String getHome(){
        return "home";
    }

    @GetMapping("/personas")
    public String vistaPersonas(Model modelo){
        List<Persona> personas = personaService.obtenerTodasLasPersonas();
        modelo.addAttribute("listaPersonas", personas);
        
        return "personas";
    }
}
