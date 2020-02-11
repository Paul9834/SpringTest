package com.paul9834.start.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Main_Controller {

    @Autowired
    private Repositorio repositorio;


    @PostMapping ("/add")
    public String addPersona (
            @RequestParam String nombre,
            @RequestParam int edad,
            @RequestParam String email
            ) {

         repositorio.save(new Entidad(nombre,edad,email));

         return "Paul";
    }









}
