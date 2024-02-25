package com.alilopez.application.models;

public class Cliente {
    private int id;
    private String name;
    private String lastName;
    private int telefono;

    public Cliente(String name, String lastName, int telefono) {
        this.name = name;
        this.lastName = lastName;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
