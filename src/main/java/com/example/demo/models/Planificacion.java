package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "planificaciones")
public class Planificacion {

    @Id
    private String id;

    private String obraId;
    private String descripcionObra;
    private List<Partida> partidas;

    public Planificacion() {
    }

    public Planificacion(String obraId, String descripcionObra, List<Partida> partidas) {
        this.obraId = obraId;
        this.descripcionObra = descripcionObra;
        this.partidas = partidas;
    }

    // Getters y setters

    public String getId() {
        return id;
    }

    public String getObraId() {
        return obraId;
    }

    public void setObraId(String obraId) {
        this.obraId = obraId;
    }

    public String getDescripcionObra() {
        return descripcionObra;
    }

    public void setDescripcionObra(String descripcionObra) {
        this.descripcionObra = descripcionObra;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }
}