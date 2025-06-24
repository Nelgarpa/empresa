package com.example.demo.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pedidos")
public class Pedido {

    @Id
    private String id;

    private String trabajadorId;
    private String fecha;
    private List<ItemPedido> items;
    private String estado; // pendiente o entregado
    private String chequeadoPor;

    public Pedido() {
    }

    public Pedido(String trabajadorId, String fecha, List<ItemPedido> items, String estado, String chequeadoPor) {
        this.trabajadorId = trabajadorId;
        this.fecha = fecha;
        this.items = items;
        this.estado = estado;
        this.chequeadoPor = chequeadoPor;
    }

    // Getters y setters

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

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setItems(List<ItemPedido> items) {
        this.items = items;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getChequeadoPor() {
        return chequeadoPor;
    }

    public void setChequeadoPor(String chequeadoPor) {
        this.chequeadoPor = chequeadoPor;
    }
}
