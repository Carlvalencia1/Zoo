package com.alilopez.application.models;

public class Cuidador extends Empleados {
    private String tipoEspecie;
    private int consultorioAsignado;

    public Cuidador(String nombre, String apellido, int edad, int habitat, String tipoEspecie, int consultorioAsignado, String id) {
        super(nombre, apellido, edad, habitat, id);
        this.tipoEspecie = tipoEspecie;
        this.consultorioAsignado = consultorioAsignado;
    }

    public String getId(){
        return super.id;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Tipo de Especie: " + tipoEspecie +
                ", Consultorio Asignado: " + consultorioAsignado +
                ", Edad: " + edad +
                ", Hábitat:" + habitat;
    }
}
