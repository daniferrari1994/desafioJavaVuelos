package com.api.vuelos.vuelos.repository;

import com.api.vuelos.vuelos.entity.pasajeros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pasajerosRepository extends JpaRepository<pasajeros, Long> {
}
