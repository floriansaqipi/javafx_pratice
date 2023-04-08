package com.example.javafx_pratice.ch12.problems;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class PolylineEx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,300,300);

        Polyline polyline = new Polyline();

        polyline.getPoints().addAll(20.0,40.0,30.0,50.0,40.0,90.0,90.0,10.0,30.0);

        pane.getChildren().add(polyline);

        primaryStage.setTitle("Polyline example");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
