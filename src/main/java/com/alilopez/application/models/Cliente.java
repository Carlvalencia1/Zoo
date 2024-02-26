package com.alilopez.application.models;


import java.util.UUID;

public class Cliente {
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
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
