module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires validatorfx;
    requires java.sql;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}