package com.alilopez.application.models;

public class Venta {
    private double monto;
    private String modelo;
    private String marca;
    private Cliente client;

    public Venta(double monto, String modelo, String marca, Cliente client) {
        this.monto = monto;
        this.modelo = modelo;
        this.marca = marca;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "monto=" + monto +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", client=" + client +
                '}';
    }
}
