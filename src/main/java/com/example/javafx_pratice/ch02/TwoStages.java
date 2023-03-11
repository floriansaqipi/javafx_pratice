package com.example.javafx_pratice.ch02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TwoStages extends Application {
    @Override
    public void start(Stage primaryStage){
        Button btn = new Button("First Stage button");
        Scene scene = new Scene(btn, 300, 300);
        primaryStage.setTitle("First Stage");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        Button btn1 = new Button("Second stage button");
        Scene scene1 = new Scene(btn1);
        stage.setScene(scene1);
        stage.setTitle("Second stage");
        stage.setResizable(false);
        stage.show();
    }

}
