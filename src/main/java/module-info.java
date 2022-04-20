module com.example.seabattle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seabattle to javafx.fxml;
    exports com.example.seabattle;
    exports com.example.seabattle.controllers;
    opens com.example.seabattle.controllers to javafx.fxml;
}