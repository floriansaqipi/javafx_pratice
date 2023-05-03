package com.example.javafx_pratice.fx14;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private ComboBox<String> myComboBox;

    private String[] choices = {"Java","C++","Javascript","1","2","3","1","2","3","1","2","3","1","2","3"};

    public void getComboBoxValue(){
        myLabel.setText(myComboBox.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myComboBox.getItems().addAll(choices);
    }
}
