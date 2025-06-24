package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "partes_diarios")
public class ParteDiario {

    @Id
    private String id;

    private String trabajadorId;
    private String fecha;
    private String descripcion;
    private List<String> imagenes;

    public ParteDiario() {}

    public ParteDiario(String trabajadorId, String fecha, String descripcion, List<String> imagenes) {
        this.trabajadorId = trabajadorId;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.imagenes = imagenes;
    }

    public String getId() {
        return id;
    }

    public String getTrabajadorId() {
        return trabajadorId;
    }

    public void setTrabajadorId(String trabajadorId) {
        this.trabajadorId = trabajadorId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<String> imagenes) {
        this.imagenes = imagenes;
    }
}
