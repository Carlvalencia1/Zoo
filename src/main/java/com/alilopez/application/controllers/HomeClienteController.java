package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Veterinario;
import com.alilopez.application.models.Cuidador;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class HomeClienteController {

    @FXML
    private Button closeButton;

    @FXML
    private Button viewCarrosButton;

    @FXML
    private Button viewMotosButton;

    @FXML
    void onClickCloseButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("login-view.fxml");
    }

    @FXML
    void onClickViewCarrosButton(MouseEvent event) {
        ArrayList<Veterinario> carros = App.getZoologico().getListaVeterinario();
        StringBuilder contenido = new StringBuilder("Lista de Veterinarios:\n");
        for (int i = 0; i < carros.size(); i++) {
            contenido.append(i+1).append(".- ").append(carros.get(i));
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Veterinarios Asignados");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }

    @FXML
    void onClickViewMotosButton(MouseEvent event) {
        ArrayList<Cuidador> motocicletas = App.getZoologico().getListaCuidador();
        StringBuilder contenido = new StringBuilder("Lista de Cuidadores:\n");
        for (int i = 0; i < motocicletas.size(); i++) {
            contenido.append(i+1).append(".- ").append(motocicletas.get(i));
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cudadores Asigandos");
        alert.setHeaderText(null);
        alert.setContentText(contenido.toString());
        alert.showAndWait();
    }
    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-danger");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
        viewCarrosButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        viewCarrosButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
        viewMotosButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        viewMotosButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }
}
