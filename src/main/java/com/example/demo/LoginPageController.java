package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController{
    public Label emailLabel;
    public Label phoneLabel;
    public Button Home;
    public AnchorPane anchorPane;
    public Label welcomeLabel;
    public Button clientButton;
    public Button adminButton;
    public Button SignupButton;
    public Label AccountTypeLabel;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    protected void SignUpPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignUpPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void Home(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void ClientLoginPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //@FXML
//    protected void AdminLoginPage(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//    }

    @FXML
        public void Exit(Stage primaryStage) {
            //Create Alert box-Confirmation type
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit");
            alert.setHeaderText("You Are About To Quit");
            alert.setContentText("Do you want to Quit?");

            if(alert.showAndWait().get() == ButtonType.OK) {
                //set stage =to the current working stage
                System.out.println("You've successfully Quit!");
                primaryStage.close();
            }
        }
}
