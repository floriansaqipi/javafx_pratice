package com.example.javafx_pratice.ch12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CircleEx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle(40,60,80);
        Rectangle rectangle = new Rectangle(100,100, 40, 40);

        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);
        Scene scene = new Scene(pane,300,300);
        stage.setTitle("ShowCircle");
        stage.setScene(scene);
        stage.show();
    }
}
