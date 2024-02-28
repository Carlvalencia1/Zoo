package com.alilopez.application.models;

public class Veterinario extends Empleados {
    private String tipoEspecie;

    private String tipoEnfermedad;

    public Veterinario(String nombre, String apellido, int edad, int habitat, String tipoEspecie, String tipoEnfermedad, String id) {
        super(apellido, nombre, edad, habitat, id);
        this.tipoEspecie = tipoEspecie;
        this.tipoEnfermedad = tipoEnfermedad;
    }
    public String getId(){
        return super.id;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", No. Consultorio: " + tipoEspecie + ", No. Pacientes: " + tipoEnfermedad + ", Edad: " + edad +
                ", Hábitat:" + habitat ;
    }

}
