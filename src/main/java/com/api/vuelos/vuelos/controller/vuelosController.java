package com.api.vuelos.vuelos.controller;

import com.api.vuelos.vuelos.entity.vuelos;
import com.api.vuelos.vuelos.repository.vuelosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apivuelos")
public class vuelosController {
    @Autowired
    private vuelosRepository vuelosRepository;

    @GetMapping("/vuelos")
    List<vuelos> getVuelos(){
        return (List<vuelos>) vuelosRepository.findAll();
    }

    @PostMapping("/vuelos")
    List<vuelos> postVuelos(vuelos vuelo){
        return (List<vuelos>) vuelosRepository.save(vuelo);
    }

    @GetMapping("/vuelos/{id}")
    Optional<vuelos> getVuelo(int id){
        return vuelosRepository.findById((long) id);
    }
}
