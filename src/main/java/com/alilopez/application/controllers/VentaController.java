package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Concesonaria;
import com.alilopez.application.models.Motocicleta;
import com.alilopez.application.models.Venta;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class VentaController {

    @FXML
    private Label alertLabel;

    @FXML
    private Button closeButton;

    @FXML
    private TextField idTextfield;

    @FXML
    private Button saveButton;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }

    @FXML
    void onClickSaveButton(MouseEvent event) {
        String id = idTextfield.getText();
        if (App.getConcesonaria().addVenta(id)){
            alertLabel.setText("Se agregó exitosamente");
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
