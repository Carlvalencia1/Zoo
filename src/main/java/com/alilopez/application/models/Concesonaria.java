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
    public boolean addVenta(Venta venta){
        return sales.add(venta);
    }


}
