package com.alilopez.application.models;

public class Carro extends Vehiculo {
    private int numPuertas;
    private String tipoCarroceria;

    public Carro(String modelo, String marca, double precio, int year, int numPuertas, String tipoCarroceria) {
        super(modelo, marca, precio, year);
        this.numPuertas = numPuertas;
        this.tipoCarroceria = tipoCarroceria;
    }
}
