package com.example.javafx_pratice.ch12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineEx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new LinePane(),200,200);
        stage.setTitle("ShowLine");
        stage.setScene(scene);
        stage.show();
    }
}

class LinePane extends Pane{
    public LinePane(){
        Line line = new Line();
        line.setStartX(10); line.setStartY(10); line.setEndX(10); line.setEndY(10);
        line.endXProperty().bind(widthProperty().subtract(10));
        line.endYProperty().bind(heightProperty().subtract(10));
        line.setStrokeWidth(5);
        line.setStroke(Color.GREEN);
        this.getChildren().add(line);

        Line line1 = new Line(10,10,10,10);
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.startXProperty().bind(widthProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        this.getChildren().add(line1);


    }
}
