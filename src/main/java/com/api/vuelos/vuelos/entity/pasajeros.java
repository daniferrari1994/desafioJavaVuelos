package com.api.vuelos.vuelos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pasajeros")
public class pasajeros {
    @Id
    private Long pasaporte;
    private String nombreApellido;
    private Integer idVuelo;
    private String origen;
    private String destino;
    private String nacionalidad;

    public pasajeros() {
    }

    public pasajeros(Long pasaporte, String nombreApellido, Integer idVuelo, String origen, String destino, String nacionalidad) {
        this.pasaporte = pasaporte;
        this.nombreApellido = nombreApellido;
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.nacionalidad = nacionalidad;
    }

    public Long getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Long pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Integer getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "pasajeros{" +
                "pasaporte=" + pasaporte +
                ", nombreApellido='" + nombreApellido + '\'' +
                ", idVuelo=" + idVuelo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
