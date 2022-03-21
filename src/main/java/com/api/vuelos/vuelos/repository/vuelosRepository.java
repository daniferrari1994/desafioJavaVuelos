package com.api.vuelos.vuelos.repository;

import com.api.vuelos.vuelos.entity.vuelos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vuelosRepository extends JpaRepository<vuelos, Long> {
}
