package com.api.vuelos.vuelos.service;


import com.api.vuelos.vuelos.entity.pasajeros;

import java.util.List;
import java.util.Optional;

public interface pasajerosService {
    List<pasajeros> getPasajeros();
    Optional<pasajeros> getPasajero(int pasaporte);
    pasajeros postPasajero(pasajeros pasajero);
}
