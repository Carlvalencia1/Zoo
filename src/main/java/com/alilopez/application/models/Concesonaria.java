package com.alilopez.application.models;

import java.util.ArrayList;

public class Concesonaria {
    private ArrayList<Cliente> clients = new ArrayList<>();
    private ArrayList<Carro> listaCarros = new ArrayList<>();
    private ArrayList<Motocicleta> listaMotos = new ArrayList<>();
    private ArrayList<Venta> sales = new ArrayList<>();
    public boolean addClient(Cliente client){
        return clients.add(client);
    }
    public boolean addCarro(Carro carro){
        return listaCarros.add(carro);
    }
    public boolean addMoto(Motocicleta moto){
        return listaMotos.add(moto);
    }
    public boolean addVenta(String idVehiculo) {
        boolean flag = false;

        for (int i = 0; i < listaCarros.size(); i++) {
            String id = listaCarros.get(i).id;
            if (idVehiculo.equals(id) && !flag) {
                double monto = listaCarros.get(i).precio;
                String modelo = listaCarros.get(i).modelo;
                String marca = listaCarros.get(i).marca;
                flag = true;
                Venta venta = new Venta(monto, modelo, marca);
                listaCarros.remove(i);
                sales.add(venta);
            }
        }

        if (!flag) {
            for (int i = 0; i < listaMotos.size(); i++) {
                String id = listaMotos.get(i).id;
                if (idVehiculo.equals(id) && !flag) {
                    flag = true;
                    listaMotos.remove(i);
                    double monto = listaMotos.get(i).precio;
                    String modelo = listaMotos.get(i).modelo;
                    String marca = listaMotos.get(i).marca;
                    Venta venta = new Venta(monto, modelo, marca);
                    sales.add(venta);
                }
            }
        }

        return flag;
    }




    public ArrayList<Cliente> getClients() {
        return clients;
    }

    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }

    public ArrayList<Motocicleta> getListaMotos() {
        return listaMotos;
    }

    public ArrayList<Venta> getSales() {
        return sales;
    }
}
