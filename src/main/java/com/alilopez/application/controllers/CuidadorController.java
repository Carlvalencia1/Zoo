package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Cuidador;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.UUID;

public class CuidadorController {

    @FXML
    private Button closeButton;

    @FXML
    private Label alertLabel;

    @FXML
    private TextField marcaTextfield;

    @FXML
    private TextField modeloTextfield;

    @FXML
    private TextField precioTextfield;

    @FXML
    private Button saveButton;

    @FXML
    private TextField tipoManubrioTextfield;

    @FXML
    private TextField tipoMotoTextfield;

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
        String tipoEspecie = tipoManubrioTextfield.getText();
        int edad = Integer.parseInt(precioTextfield.getText());
        int consultorioAsignado = Integer.parseInt(tipoMotoTextfield.getText());
        int habitat = Integer.parseInt(yearTextfield.getText());
        UUID id = UUID.randomUUID();
        String randomId = id.toString();
        Cuidador moto = new Cuidador(nombre, apellido, edad, habitat, tipoEspecie, consultorioAsignado, randomId);
        if (App.getZoologico().addMoto(moto)){
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
