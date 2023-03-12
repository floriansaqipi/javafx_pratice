package com.example.javafx_pratice.ch09;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontEx extends Application {
    @Override
    public void start(Stage primaryStage){
        Font font = new Font("SansSerif",13);
        Font font1 = Font.font("Times new Romans", FontWeight.BLACK, FontPosture.ITALIC,12);
        System.out.println(Font.getFontNames());
        System.out.println(Font.getFamilies());
    }
}
