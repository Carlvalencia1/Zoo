package com.alilopez.application.controllers;

import com.alilopez.application.App;
import com.alilopez.application.models.Login;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button clienteButton;
    @FXML
    private Label titleLabel;
    @FXML
    private Label passLabel;
    @FXML
    private Label userLabel;
    @FXML
    private Button salirButton;

    @FXML
    private PasswordField contraTextField;

    @FXML
    private Button loginButton;

    @FXML
    private TextField usuarioTextField;

    @FXML
    private Label wrongDataLabel;

    @FXML
    void onClickClienteButton(MouseEvent event) throws IOException {
        App escena = new App();
        escena.changeScene("homeEmpleado-view.fxml");
    }

    @FXML
    void onClickLoginButton(MouseEvent event) throws IOException {
        App escena = new App();
        String usuario = usuarioTextField.getText();
        String password = contraTextField.getText();
        Login user = new Login();
        if (user.checkLogin(usuario, password)){
            escena.changeScene("homeAdmin-view.fxml");
        } else {
            wrongDataLabel.setVisible(true);
            wrongDataLabel.setText("Datos Incorrectos");
        }

    }
    @FXML
    void onClickSalirButton(MouseEvent event) {
        Platform.exit();
    }
    @FXML
    void initialize() {
        salirButton.getStyleClass().setAll("btn","btn-gl","btn-danger");
        salirButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 800; -fx-alignment: center;");
        loginButton.getStyleClass().setAll("btn","btn-gl","btn-success");
        loginButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 800; -fx-alignment: center;");
        clienteButton.getStyleClass().setAll("btn","btn-gl","btn-primary");
        clienteButton.setStyle("-fx-font-size: 16px; -fx-font-weight: 800; -fx-alignment: center;");
        wrongDataLabel.getStyleClass().setAll("lbl","lbl-warning");
        userLabel.getStyleClass().setAll("lbl","lbl-default");
        userLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: 800; -fx-alignment: center;");
        passLabel.getStyleClass().setAll("lbl","lbl-default");
        passLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: 800; -fx-alignment: center;");
        titleLabel.getStyleClass().setAll("lbl","lbl-info");
        titleLabel.setStyle("-fx-font-size: 40px; -fx-font-weight: 800; -fx-alignment: center;");

    }
}
