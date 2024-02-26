package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.*;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class HomeVendedorController {

    @FXML
    private BottomNavigationButton addCarroButton;

    @FXML
    private BottomNavigationButton viewVentasButton;

    @FXML
    private BottomNavigationButton addVentaButton;

    @FXML
    private BottomNavigationButton addMotoButton;

    @FXML
    private BottomNavigationButton addClientButton;

    @FXML
    private BottomNavigationButton clientesButton;

    @FXML
    private Button exitButton;

    @FXML
    private BottomNavigationButton viewAvailableCarsButton;

    @FXML
    private BottomNavigationButton viewAvailableMotosButton;

    @FXML
    void onClickAddCarroButton(MouseEvent event) {
        App.newStage("carro-view", "App - View Carro");
    }

    @FXML
    void onClickAddClienteButton(MouseEvent event) {
        App.newStage("client-view", "App - View Client");
    }

    @FXML
    void onClickAddMotoButton(MouseEvent event) {
        App.newStage("moto-view", "App - View Moto");
    }

    @FXML
    void onClickClientesButton(MouseEvent event) {
        ArrayList<Cliente> clientes = App.getConcesonaria().getClients();
        StringBuilder contenido = new StringBuilder("Lista de Clientes:\n");
        for (int i = 0; i < clientes.size(); i++) {
            contenido.append(i+1).append(".- ").append(clientes.get(i)).append("\n");
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Clientes Registrados");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickViewAvailableCarsButton(MouseEvent event) {
        ArrayList<Carro> carros = App.getConcesonaria().getListaCarros();
        StringBuilder contenido = new StringBuilder("Lista de Carros:\n");
        for (int i = 0; i < carros.size(); i++) {
            contenido.append(i+1).append(".- ").append(carros.get(i)).append(" ").append(carros.get(i).getId()).append("\n");
            System.out.println(carros.get(i).getId());
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Carros Disponibles");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickViewAvailableMotosButton(MouseEvent event) {
        ArrayList<Motocicleta> motocicletas = App.getConcesonaria().getListaMotos();
        StringBuilder contenido = new StringBuilder("Lista de Motocicletas:\n");
        for (int i = 0; i < motocicletas.size(); i++) {
            contenido.append(i+1).append(".- ").append(motocicletas.get(i)).append(" ").append(motocicletas.get(i).getId()).append("\n");
            System.out.println(motocicletas.get(i).getId());
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Motocicletas Disponibles");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickViewVentasButton(MouseEvent event) {
        ArrayList<Venta> ventas = App.getConcesonaria().getSales();
        StringBuilder contenido = new StringBuilder("Lista de Ventas:\n");
        for (int i = 0; i < ventas.size(); i++) {
            contenido.append(i+1).append(".- ").append(ventas.get(i)).append("\n");
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ventas Disponibles");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickAddVentaButton(MouseEvent event) {
        App.newStage("venta-view", "App - View Venta");
    }

    @FXML
    void onMouseClickExitButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("login-view.fxml");
    }
    @FXML
    void initialize() {
        exitButton.getStyleClass().setAll("btn","btn-gl","btn-success");
        exitButton.setStyle("-fx-font-size: 20px; -fx-font-weight: 900; -fx-alignment: center;");
    }
}
