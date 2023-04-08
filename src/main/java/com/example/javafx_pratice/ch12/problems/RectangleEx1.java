package com.example.javafx_pratice.ch12.problems;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleEx1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,300,300);

        Rectangle rectangle = new Rectangle(10,10,100,200);
        rectangle.setArcWidth(40);
        rectangle.setArcHeight(20);

        pane.getChildren().add(rectangle);

        primaryStage.setTitle("Rounded Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
