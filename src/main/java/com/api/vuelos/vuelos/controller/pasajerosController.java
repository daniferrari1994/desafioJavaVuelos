package com.api.vuelos.vuelos.controller;

import com.api.vuelos.vuelos.entity.pasajeros;
import com.api.vuelos.vuelos.repository.pasajerosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apivuelos")
public class pasajerosController {
    @Autowired
    private pasajerosRepository pasajerosRepository;

    @GetMapping("/pasajeros")
    List<pasajeros> getPasajeros(){
        return pasajerosRepository.findAll();
    }

    @GetMapping("/pasajeros/{id}")
    Optional<pasajeros> getPasajero(int id){
        return pasajerosRepository.findById((long) id);
    }

    @PostMapping("/pasajeros")
    pasajeros postPasajero(pasajeros pasajero){
        return pasajerosRepository.save(pasajero);
    }
}
