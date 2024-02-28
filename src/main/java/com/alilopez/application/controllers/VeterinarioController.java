package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Veterinario;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.UUID;

public class VeterinarioController {
    @FXML
    private Label alertLabel;

    @FXML
    private Button closeButton;

    @FXML
    private TextField marcaTextfield;

    @FXML
    private TextField modeloTextfield;

    @FXML
    private TextField numPuertasTextfield;

    @FXML
    private TextField precioTextfield;

    @FXML
    private Button saveButton;

    @FXML
    private TextField tipoCarroceriaTextfield;

    @FXML
    private TextField yearTextfield;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        String nombre = marcaTextfield.getText();
        String apellido = modeloTextfield.getText();
        String carroceria = tipoCarroceriaTextfield.getText();
        int edad = Integer.parseInt(precioTextfield.getText());
        String tipoEspecie = String.valueOf(Integer.parseInt(numPuertasTextfield.getText()));
        int habitat = Integer.parseInt(yearTextfield.getText());
        UUID id = UUID.randomUUID();
        String randomId = id.toString();
        Veterinario car = new Veterinario(nombre, apellido, edad, habitat, tipoEspecie, carroceria, randomId);
        if (App.getZoologico().addCarro(car)){
            alertLabel.setText("ID generado: " + randomId);
        } else {
            alertLabel.setText("No se pudo agregar");
        }
    }
    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-danger");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
        saveButton.getStyleClass().setAll("btn","btn-success");
        saveButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }

}
