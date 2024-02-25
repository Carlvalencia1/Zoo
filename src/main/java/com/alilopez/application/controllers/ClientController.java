package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Cliente;
import com.alilopez.application.models.Concesonaria;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ClientController {

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
        String apellido = lastnameTextfield.getText();
        int telefono = Integer.parseInt(telefonoTextfield.getText());
        Cliente cliente = new Cliente(nombre, apellido, telefono);
        Concesonaria list = new Concesonaria();
        if (list.addClient(cliente)){
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
