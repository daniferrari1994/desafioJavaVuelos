package com.api.vuelos.vuelos.service.impl;

import com.api.vuelos.vuelos.entity.pasajeros;
import com.api.vuelos.vuelos.repository.pasajerosRepository;
import com.api.vuelos.vuelos.service.pasajerosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class pasajerosServiceImpl implements pasajerosService {
    private final pasajerosRepository pasajerosRepository;

    @Override
    public List<pasajeros> getPasajeros() {return pasajerosRepository.findAll();}

    @Override
    public Optional<pasajeros> getPasajero(int pasaporte){return Optional.empty();}

    @Override
    public pasajeros postPasajero(pasajeros pasajero) {
        return null;
    }
}
