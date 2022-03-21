package com.api.vuelos.vuelos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AVIONES")
public class aviones {
    @Id
    private Integer id;
    private String clase;
    private String modelo;
    private Integer capacidad;

    public aviones(Integer id, String clase, String modelo, Integer capacidad) {
        this.id = id;
        this.clase = clase;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public aviones() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "aviones{" +
                "id=" + id +
                ", clase='" + clase + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
