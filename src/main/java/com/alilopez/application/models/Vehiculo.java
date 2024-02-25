package com.alilopez.application.models;

public class Vehiculo {
    protected String modelo;
    protected String marca;
    protected double precio;
    protected int year;

    public Vehiculo(String modelo, String marca, double precio, int year) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.year = year;
    }
}
