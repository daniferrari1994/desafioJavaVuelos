package com.api.vuelos.vuelos.controller;

import com.api.vuelos.vuelos.entity.aviones;
import com.api.vuelos.vuelos.repository.avionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/apivuelos")
public class avionesController {
    @Autowired
    private avionesRepository avionesRepository;

    @GetMapping("/aviones")
    List<aviones> getAviones(){
        return (List<aviones>) avionesRepository.findAll();
    }

    @GetMapping("/aviones/{id}")
    Optional<aviones> getAvion(int id){
        return avionesRepository.findById((long) id);
    }

    @PostMapping("/aviones")
    aviones postAviones(@RequestBody aviones avion){
        return avionesRepository.save(avion);
    }
}
