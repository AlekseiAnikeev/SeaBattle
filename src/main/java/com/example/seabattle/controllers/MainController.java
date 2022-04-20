package com.example.seabattle.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 19.04.2022
 */

public class MainController {

    @FXML
    private Button exitButton;

    @FXML
    private Button newGameButton;

    @FXML
    private Button rulesOfTheGameButton;

    @FXML
    void initialize() {
        newGameButton.setOnAction(event -> {
            System.out.println("Ебать привет как ты");
        });
        exitButton.setOnAction(event -> {
            System.out.println("Я умываю руки");
            Platform.exit();
        });
    }
}

