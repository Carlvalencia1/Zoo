package com.alilopez.application.models;

import java.util.UUID;

public class Venta {
    private double monto;
    private String modelo;
    private String marca;

    public Venta(double monto, String modelo, String marca) {
        this.monto = monto;
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "monto=" + monto +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

}
