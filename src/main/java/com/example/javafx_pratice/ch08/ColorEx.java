package com.example.javafx_pratice.ch08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorEx extends Application {
    @Override
    public void start(Stage primaryStage){
        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(100);
        circle.setStroke(null);
        Color purple = new Color(0.25,0.14,0.333,0.51);
        Color purpleLight = purple.brighter();
        Color purpleDark = purple.darker();
        circle.setFill(purple);
        circle.setFill(purpleLight);
        circle.setFill(purpleDark);

        StackPane pane = new StackPane();
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane,600,600);

        primaryStage.setTitle("Color Example");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
