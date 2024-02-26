package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Carro;
import com.alilopez.application.models.Concesonaria;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.UUID;

public class CarroController {
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
        String marca = marcaTextfield.getText();
        String modelo = modeloTextfield.getText();
        String carroceria = tipoCarroceriaTextfield.getText();
        int precio = Integer.parseInt(precioTextfield.getText());
        int puertas = Integer.parseInt(numPuertasTextfield.getText());
        int year = Integer.parseInt(yearTextfield.getText());
        UUID id = UUID.randomUUID();
        String randomId = id.toString();
        Carro car = new Carro(modelo, marca, precio, year, puertas, carroceria, randomId);
        if (App.getConcesonaria().addCarro(car)){
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
