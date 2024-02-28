package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.*;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
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
        App.newStage("veterinario-view", "App - View Veterinario");
    }

    @FXML
    void onClickAddClienteButton(MouseEvent event) {
        App.newStage("especie-view", "App - View Especie");
    }

    @FXML
    void onClickAddMotoButton(MouseEvent event) {
        App.newStage("cuidador-view", "App - View Cuidador");
    }

    @FXML
    void onClickClientesButton(MouseEvent event) {
        ArrayList<Especie> clientes = App.getZoologico().getClients();
        StringBuilder contenido = new StringBuilder("Lista de Especies:\n");
        for (int i = 0; i < clientes.size(); i++) {
            contenido.append(i+1).append(".- ").append(clientes.get(i)).append("\n");
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Especies Registradas");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickViewAvailableCarsButton(MouseEvent event) {
        ArrayList<Veterinario> carros = App.getZoologico().getListaVeterinario();
        StringBuilder contenido = new StringBuilder("Lista de Veterinarios:\n");
        for (int i = 0; i < carros.size(); i++) {
            contenido.append(i+1).append(".- ").append(carros.get(i)).append(" ").append(carros.get(i).getId()).append("\n");
            System.out.println(carros.get(i).getId());
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Veterinarios:");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickViewAvailableMotosButton(MouseEvent event) {
        ArrayList<Cuidador> motocicletas = App.getZoologico().getListaCuidador();
        StringBuilder contenido = new StringBuilder("Lista de Cuidadores:\n");
        for (int i = 0; i < motocicletas.size(); i++) {
            contenido.append(i+1).append(".- ").append(motocicletas.get(i)).append(" ").append(motocicletas.get(i).getId()).append("\n");
            System.out.println(motocicletas.get(i).getId());
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cuidadores");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickViewVentasButton(MouseEvent event) {
        ArrayList<Venta> ventas = App.getZoologico().getSales();
        StringBuilder contenido = new StringBuilder("Lista de cmabios de Zoo:\n");
        for (int i = 0; i < ventas.size(); i++) {
            contenido.append(i+1).append(".- ").append(ventas.get(i)).append("\n");
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cambios");
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
        addMotoButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        addMotoButton.setStyle("-fx-alignment: center;");
        addCarroButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        addCarroButton.setStyle("-fx-alignment: center;");
        addClientButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        addClientButton.setStyle("-fx-alignment: center;");
        addVentaButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        addVentaButton.setStyle("-fx-alignment: center;");
        clientesButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        clientesButton.setStyle("-fx-alignment: center;");
        viewAvailableCarsButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        viewAvailableCarsButton.setStyle("-fx-alignment: center;");
        viewAvailableMotosButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        viewAvailableMotosButton.setStyle("-fx-alignment: center;");
        viewVentasButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        viewVentasButton.setStyle("-fx-alignment: center;");
    }
}
