package com.alilopez.application.models;

public class Carro extends Vehiculo {
    private int numPuertas;
    private String tipoCarroceria;

    public Carro(String modelo, String marca, int precio, int year, int numPuertas, String tipoCarroceria) {
        super(modelo, marca, precio, year);
        this.numPuertas = numPuertas;
        this.tipoCarroceria = tipoCarroceria;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numPuertas=" + numPuertas +
                ", tipoCarroceria='" + tipoCarroceria + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", year=" + year +
                '}';
    }
}
