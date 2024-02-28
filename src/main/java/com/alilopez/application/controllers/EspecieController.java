package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Especie;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EspecieController {

    @FXML
    private Button closeButton;

    @FXML
    private Label alertLabel;

    @FXML
    private Button saveButton;
    @FXML
    private TextField lastnameTextfield;

    @FXML
    private TextField nombreTextfield;
    @FXML
    private TextField telefonoTextfield;

    @FXML
    void onClickCloseButton(MouseEvent event) {
        App.getStageView().close();
    }
    @FXML
    void onClickSaveButton(MouseEvent event) {
        String nombre = nombreTextfield.getText();
        String especie = lastnameTextfield.getText();
        int tnumeroHabitat = Integer.parseInt(telefonoTextfield.getText());
        Especie empleado = new Especie(nombre, especie, tnumeroHabitat);
        if (App.getZoologico().addClient(empleado)){
            alertLabel.setText("Se agrego especie");
        } else {
            alertLabel.setText("No se pudo agregar especie");
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
