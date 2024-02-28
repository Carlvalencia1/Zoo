package com.alilopez.application.models;

public class Empleados {
    protected String nombre;
    protected String apellido;
    protected int habitat;
    protected int edad;
    protected String id;

    public Empleados(String nombre, String apellido, int edad, int habitat, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad =  edad;
        this.habitat = habitat;
        this.id = id;
    }

}
