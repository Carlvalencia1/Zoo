package com.alilopez.application.controllers;

import com.alilopez.application.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CarroController {

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

    }
    @FXML
    void initialize() {
        closeButton.getStyleClass().setAll("btn","btn-danger");
        closeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
        saveButton.getStyleClass().setAll("btn","btn-success");
        saveButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 700; -fx-alignment: center;");
    }

}
