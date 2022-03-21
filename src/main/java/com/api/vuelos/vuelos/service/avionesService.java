package com.api.vuelos.vuelos.service;

import com.api.vuelos.vuelos.entity.aviones;
import com.api.vuelos.vuelos.entity.pasajeros;

import java.util.List;
import java.util.Optional;

public interface avionesService {
    List<aviones> getAviones();
    Optional<aviones> getAvion(int id);
    Optional<pasajeros> getPasajeros(int id);
    List<aviones> postAviones(aviones aviones);
}
