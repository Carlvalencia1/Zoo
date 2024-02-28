package com.alilopez.application.models;


public class Especie {
    private String name;
    private String especie;
    private int numeroHabitat;

    public Especie(String name, String especie, int numeroHabitat) {
        this.name = name;
        this.especie = especie;
        this.numeroHabitat = numeroHabitat;
    }

    @Override
    public String toString() {
        return "Especie|" +
                ", name='" + name + '\'' +
                ", especie='" + especie + '\'' +
                ", numeroHabitat=" + numeroHabitat +
                '|';
    }
}
