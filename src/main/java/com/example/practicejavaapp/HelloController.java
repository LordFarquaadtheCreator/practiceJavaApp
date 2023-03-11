package com.example.practicejavaapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label kys;

    @FXML
    protected void onHelloButtonClick() {
        kys.setText("congrats you earned free roblux!!!!!");
    }
}