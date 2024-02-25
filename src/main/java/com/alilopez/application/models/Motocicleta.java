package com.alilopez.application.models;

public class Motocicleta extends Vehiculo {
    private String tipoMoto;
    private String tipoManubrio;

    public Motocicleta(String modelo, String marca, double precio, int year, String tipoMoto, String tipoManubrio) {
        super(modelo, marca, precio, year);
        this.tipoMoto = tipoMoto;
        this.tipoManubrio = tipoManubrio;
    }
}
