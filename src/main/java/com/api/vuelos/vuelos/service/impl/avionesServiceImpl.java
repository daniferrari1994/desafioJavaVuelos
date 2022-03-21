package com.api.vuelos.vuelos.service.impl;


import com.api.vuelos.vuelos.entity.aviones;
import com.api.vuelos.vuelos.entity.pasajeros;
import com.api.vuelos.vuelos.repository.avionesRepository;
import com.api.vuelos.vuelos.service.avionesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class avionesServiceImpl implements avionesService {
    private final avionesRepository avionesRepository;

    @Override
    public List<aviones> getAviones(){return avionesRepository.findAll();}

    @Override
    public Optional<aviones> getAvion(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<pasajeros> getPasajeros(int id){return Optional.empty();}

    @Override
    public  List<aviones> postAviones(aviones aviones){return (List<aviones>) avionesRepository.save(aviones);}

}

