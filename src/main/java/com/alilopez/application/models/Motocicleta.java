package com.alilopez.application.models;

public class Motocicleta extends Vehiculo {
    private String tipoMoto;
    private String tipoManubrio;

    public Motocicleta(String modelo, String marca, int precio, int year, String tipoMoto, String tipoManubrio) {
        super(modelo, marca, precio, year);
        this.tipoMoto = tipoMoto;
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "tipoMoto='" + tipoMoto + '\'' +
                ", tipoManubrio='" + tipoManubrio + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", year=" + year +
                '}';
    }
}
