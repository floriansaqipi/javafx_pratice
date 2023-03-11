package com.example.javafx_pratice.ch05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CirclePane extends Application {
    @Override
    public void start(Stage primaryStage){
            Circle circle = new Circle();
            circle.setCenterX(100);
            circle.setCenterY(100);
            circle.setRadius(50);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);

            Pane pane = new Pane();
            pane.getChildren().add(circle);

            Scene scene = new Scene(pane,200,200);
            primaryStage.setTitle("Circle App");
            primaryStage.setScene(scene);
            primaryStage.show();
    }
}
