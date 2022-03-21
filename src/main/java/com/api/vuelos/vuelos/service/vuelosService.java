package com.api.vuelos.vuelos.service;

import com.api.vuelos.vuelos.entity.*;

import java.util.List;
import java.util.Optional;

public interface vuelosService {
    List<vuelos> getVuelos();
    Optional<vuelos> getVuelo(int id);
    List<vuelos> postVuelos(vuelos vuelo);
}
