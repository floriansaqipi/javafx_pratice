package com.example.javafx_pratice.fx05;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
    @FXML
    private Label nameLabel;

    public void displayName(String username){
        nameLabel.setText("Hello: " + username);
    }
}
