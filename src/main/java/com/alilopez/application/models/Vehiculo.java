package com.alilopez.application.models;

public class Vehiculo {
    protected String modelo;
    protected String marca;
    protected int precio;
    protected int year;

    public Vehiculo(String modelo, String marca, int precio, int year) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", year=" + year +
                '}';
    }
}
