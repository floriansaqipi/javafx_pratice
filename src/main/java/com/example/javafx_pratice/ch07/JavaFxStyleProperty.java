package com.example.javafx_pratice.ch07;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class JavaFxStyleProperty extends Application {
    public void start(Stage primaryStage){

        Pane pane  = new Pane();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(100);
        circle.setStyle("-fx-stroke: black; -fx-fill:red;");

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane,500,500);

        primaryStage.setTitle("CSS for JavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
