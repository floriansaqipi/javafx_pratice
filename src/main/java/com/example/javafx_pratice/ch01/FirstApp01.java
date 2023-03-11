package com.example.javafx_pratice.ch01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FirstApp01 extends Application {
    @Override
    public void start (Stage primaryStage){
        Button btOk = new Button("OK");
        Scene scene = new Scene(btOk,200,250);

        primaryStage.setTitle("First Program");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}