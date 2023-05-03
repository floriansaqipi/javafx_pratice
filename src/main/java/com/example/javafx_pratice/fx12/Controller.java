package com.example.javafx_pratice.fx12;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Pane myPane;
    @FXML
    private ColorPicker myColorPicker;

    public void changeColor(){
        Color myColor = myColorPicker.getValue();
        myPane.setBackground(new Background(new BackgroundFill(myColor, null,null)));
    }
}
