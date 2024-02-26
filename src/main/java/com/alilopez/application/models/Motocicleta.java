package com.alilopez.application.models;

import java.util.UUID;

public class Motocicleta extends Vehiculo {
    private String tipoMoto;
    private String tipoManubrio;

    public Motocicleta(String modelo, String marca, int precio, int year, String tipoMoto, String tipoManubrio, String id) {
        super(modelo, marca, precio, year, id);
        this.tipoMoto = tipoMoto;
        this.tipoManubrio = tipoManubrio;
    }

    public String getId(){
        return super.id;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Tipo de moto: " + tipoMoto +
                ", Tipo de Manubrio: " + tipoManubrio +
                ", Precio: " + precio +
                ", Año:" + year;
    }
}
