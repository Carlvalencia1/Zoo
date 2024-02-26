package com.alilopez.application.models;

import java.util.UUID;

public class Carro extends Vehiculo {
    private int numPuertas;

    private String tipoCarroceria;

    public Carro(String modelo, String marca, int precio, int year, int numPuertas, String tipoCarroceria, String id) {
        super(modelo, marca, precio, year, id);
        this.numPuertas = numPuertas;
        this.tipoCarroceria = tipoCarroceria;
    }
    public String getId(){
        return super.id;
    }
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", No. puertas: " + numPuertas + ", Tipo de Carroceria: " + tipoCarroceria + ", Precio: " + precio +
                ", Año:" + year ;
    }

}
