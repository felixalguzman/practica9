package com.tarea.practica9.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class Encuesta {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String nombre;
    private String sector;
    private String nivelEscolar;
    private String latitdud;
    private String longitud;

    public Encuesta() {
    }

    public Encuesta(String nombre, String sector, String nivelEscolar, String latitdud, String longitud) {
        this.nombre = nombre;
        this.sector = sector;
        this.nivelEscolar = nivelEscolar;
        this.latitdud = latitdud;
        this.longitud = longitud;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(String nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public String getLatitdud() {
        return latitdud;
    }

    public void setLatitdud(String latitdud) {
        this.latitdud = latitdud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
