package com.alilopez.application.models;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Especie> clients = new ArrayList<>();
    private ArrayList<Veterinario> listaVeterinario = new ArrayList<>();
    private ArrayList<Cuidador> listaCuidador = new ArrayList<>();
    private ArrayList<Venta> sales = new ArrayList<>();
    public boolean addClient(Especie client){
        return clients.add(client);
    }
    public boolean addCarro(Veterinario carro){
        return listaVeterinario.add(carro);
    }
    public boolean addMoto(Cuidador moto){
        return listaCuidador.add(moto);
    }
    public boolean addVenta(String idVehiculo) {
        boolean flag = false;

        for (int i = 0; i < listaVeterinario.size(); i++) {
            String id = listaVeterinario.get(i).id;
            if (idVehiculo.equals(id) && !flag) {
                double monto = listaVeterinario.get(i).edad;
                String modelo = listaVeterinario.get(i).nombre;
                String marca = listaVeterinario.get(i).apellido;
                flag = true;
                Venta venta = new Venta(monto, modelo, marca);
                listaVeterinario.remove(i);
                sales.add(venta);
            }
        }

        if (!flag) {
            for (int i = 0; i < listaCuidador.size(); i++) {
                String id = listaCuidador.get(i).id;
                if (idVehiculo.equals(id) && !flag) {
                    flag = true;
                    listaCuidador.remove(i);
                    double monto = listaCuidador.get(i).edad;
                    String modelo = listaCuidador.get(i).nombre;
                    String marca = listaCuidador.get(i).apellido;
                    Venta venta = new Venta(monto, modelo, marca);
                    sales.add(venta);
                }
            }
        }

        return flag;
    }




    public ArrayList<Especie> getClients() {
        return clients;
    }

    public ArrayList<Veterinario> getListaVeterinario() {
        return listaVeterinario;
    }

    public ArrayList<Cuidador> getListaCuidador() {
        return listaCuidador;
    }

    public ArrayList<Venta> getSales() {
        return sales;
    }
}
