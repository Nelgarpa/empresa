package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "obras")
public class Obra {

    @Id
    private String id;

    private String nombre;
    private String direccion;
    private String fechaInicio;
    private String fechaFinEstimada;

    public Obra() {
    }

    public Obra(String nombre, String direccion, String fechaInicio, String fechaFinEstimada) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
    }

    // Getters y setters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(String fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }
}