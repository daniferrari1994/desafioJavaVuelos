package com.api.vuelos.vuelos.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vuelos")
public class vuelos {
    @Id
    private Integer id;
    private Integer cantPasajeros;
    private Date fecha;
    private String aerolinea;
    private String origen;
    private String destino;

    public vuelos(Integer id, Integer cantPasajeros, Date fecha, String aerolinea, String origen, String destino) {
        this.id = id;
        this.cantPasajeros = cantPasajeros;
        this.fecha = fecha;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
    }

    public vuelos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(Integer cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
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

    @Override
    public String toString() {
        return "vuelos{" +
                "cantPasajeros=" + cantPasajeros +
                ", fecha=" + fecha +
                ", aerolinea='" + aerolinea + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
