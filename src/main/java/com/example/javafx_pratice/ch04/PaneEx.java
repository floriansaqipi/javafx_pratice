package com.example.javafx_pratice.ch04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PaneEx extends Application {
    @Override
    public void start(Stage primaryStage){
        StackPane pane = new StackPane();
        Button btn= new Button("I'm inside a pane");
        pane.getChildren().add(btn);
        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("First Pane App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
