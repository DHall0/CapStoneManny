package com.example.demo;

import com.example.demo.customer.Customer;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


@SuppressWarnings("ALL")
public class DashBoardController  {
    @FXML
    private Circle circle;
    @FXML
    private BarChart<String, Double> chart;
    @FXML
    private BorderPane LandingPageBorder;
    @FXML
    private Label userNameCard2, card2Number, balanceLabelCard2, VisaLabelCard2m, card1Number,
            balanceLabelCard1, userNameCard1, VisaLabelCard1, TimeDateLabel, cardLabel1, dashLabel, nameLabel
            , VisaLabelCard2, savingsBalance, Savingslabel, checkingsBalance;
    public AnchorPane goldColoredCard, blueColoredCard, anchorPane;
    public Button card1PlusButton, exit, Home, Logout, homeButton;
    @FXML
    private  FontAwesomeIconView bars, HomeButton, list, image, gear,plus;
    @FXML
    private ImageView securityLogo, bankLogo;
    @FXML
    private  Separator separator;
    private Stage stage;
    private Scene scene;
    private Parent root;
//    @Override
//    public void intialize(URL url, ResourceBundle rb){
//        //circle.setFill((new ImagePattern("/Summit Fin Corp.png")));
//        XYChart.Series<String,Double> series_01 = new XYChart.Series();
//        series_01.setName("Year 2022");
//        series_01.getData().add(new XYChart.Data("Jan", 500));
//        series_01.getData().add(new XYChart.Data("Feb", 400));
//        series_01.getData().add(new XYChart.Data("Mar", 300));
//        series_01.getData().add(new XYChart.Data("Apr", 200));
//        series_01.getData().add(new XYChart.Data("May", 700));
//        chart.getData().add(series_01);
//    }
    @FXML
    protected void Home(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void Logout(ActionEvent event) throws IOException {
        //Logout Alert
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You Are About To Logout");
        alert.setContentText("Do you want to Logout?");

        //If they click ok-logout-return to the login screen
        if(alert.showAndWait().get() == ButtonType.OK) {
            root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    //Save any progress and close stage
    @FXML
    public void Exit(ActionEvent event) {
        //Create Alert box-Confirmation type
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You Are About To Quit");
        alert.setContentText("Do you want to Quit?");
        if(alert.showAndWait().get() == ButtonType.OK) {
        //set stage =to the current working stage
        stage = (Stage) anchorPane.getScene().getWindow();
        System.out.println("You've successfully Quit!");
        stage.close();
        }
    }

    public void displayName(String username){
        nameLabel.setText("Hello, " + "firstName + lastName" + ". Welcome to your Summit Dashboard!" );
    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//    }
}

