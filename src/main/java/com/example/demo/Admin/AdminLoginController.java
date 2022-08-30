package com.example.demo.Admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;


public class AdminLoginController {
    @FXML
    public BorderPane AdminLogin;
    @FXML
    private Button loginButton;
    @FXML
    private TextField nameTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label passwordLabel;
    @FXML
    private Label AdminLabel;
    @FXML
    private Label welcomeLabel;
    @FXML
    private Label passwordShow;
    @FXML
    private Label emailLabel;
    @FXML
    private Label phoneLabel;
    @FXML
    private Button Home;


    public void Home(ActionEvent actionEvent) throws IOException {

    }

    public void validateLogin(ActionEvent actionEvent) {
    }
}
