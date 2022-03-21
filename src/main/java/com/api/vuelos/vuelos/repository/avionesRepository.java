package com.api.vuelos.vuelos.repository;

import com.api.vuelos.vuelos.entity.aviones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface avionesRepository extends JpaRepository<aviones, Long> {
}
