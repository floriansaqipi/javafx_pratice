package com.example.javafx_pratice.ch12.problems;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class EllipseEx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,300,300);

        Ellipse ellipse = new Ellipse(50,150,50,100);

        pane.getChildren().add(ellipse);
        primaryStage.setTitle("Ellipse example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
