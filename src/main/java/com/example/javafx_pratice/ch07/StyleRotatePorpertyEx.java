package com.example.javafx_pratice.ch07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StyleRotatePorpertyEx extends Application {
    @Override
    public void start(Stage primaryStage){
        StackPane stackPane = new StackPane();
        Button btn = new Button("OK");
        btn.setStyle("-fx-border-color: blue; -fx-text-fill:red;");
        btn.setRotate(-15);

        stackPane.getChildren().add(btn);
        stackPane.setRotate(45);
        stackPane.setStyle("-fx-border-color: red; -fx-background-color: lightgray;");

        Scene scene = new Scene(stackPane,200,200);

        primaryStage.setTitle("Rotate and style properties");
        primaryStage.setScene(scene);
        primaryStage.show();
        //contains(int x, int y) check if node contains that coordinate
    }
}
