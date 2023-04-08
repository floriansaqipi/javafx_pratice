package com.example.javafx_pratice.ch12.problems;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ArcEx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 300);

        Arc arc = new Arc(150,150,50,50,0,180);
        arc.setType(ArcType.OPEN);
        arc.setFill(null);
        arc.setStroke(Color.BLACK);

        Arc arc1 = new Arc(150,150,50,50,180,180);
        arc1.setType(ArcType.OPEN);
        arc1.setFill(Color.RED);

        pane.getChildren().addAll(arc,arc1);

        primaryStage.setTitle("Arc example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
