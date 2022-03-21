package com.api.vuelos.vuelos.service.impl;

import com.api.vuelos.vuelos.entity.*;
import com.api.vuelos.vuelos.repository.*;
import com.api.vuelos.vuelos.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class vuelosServiceImpl implements vuelosService {

    private final vuelosRepository vuelosRepository;

    @Override
    public List<vuelos> getVuelos() {return vuelosRepository.findAll();}

    @Override
    public Optional<vuelos> getVuelo(int id){return Optional.empty();}

    @Override
    public List<vuelos> postVuelos(vuelos vuelo) {
        return (List<vuelos>) vuelosRepository.save(vuelo);
    }

}
