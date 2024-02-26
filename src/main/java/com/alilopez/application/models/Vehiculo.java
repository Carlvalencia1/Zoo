package com.alilopez.application.models;

import java.util.UUID;

public class Vehiculo {
    protected String modelo;
    protected String marca;
    protected int precio;
    protected int year;
    protected String id;

    public Vehiculo(String modelo, String marca, int precio, int year, String id) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.year = year;
        this.id = id;
    }

}
