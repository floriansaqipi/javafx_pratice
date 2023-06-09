package com.example.javafx_pratice.ch12.problems;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PolygonEx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane);

        Polygon polygon = new Polygon();
        ObservableList<Double> list = polygon.getPoints();

        list.addAll(20.0,40.0,30.0,50.0,40.0,90.0,90.0,10.0,10.0,30.0);

        pane.getChildren().add(polygon);

        primaryStage.setTitle("Polygon example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
