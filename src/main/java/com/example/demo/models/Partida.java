package com.example.demo.models;


public class Partida {
    private String nombre;
    private String plazo;
    private String estado; // pendiente o gestionada

    public Partida() {
    }

    public Partida(String nombre, String plazo, String estado) {
        this.nombre = nombre;
        this.plazo = plazo;
        this.estado = estado;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
