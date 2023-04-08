package com.example.javafx_pratice.ch12.problems;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineEx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300,300);

        Line line = new Line(10,10,70,30);
        line.setStrokeWidth(10);

        pane.getChildren().add(line);
        stage.setTitle("LineEx");
        stage.setScene(scene);
        stage.show();
    }
}
