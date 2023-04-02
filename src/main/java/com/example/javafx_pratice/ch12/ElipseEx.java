package com.example.javafx_pratice.ch12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ElipseEx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,250,250);


        for(int i = 0,j = 0;i<18;i++, j += 10){
            Ellipse ellipse = new Ellipse(pane.getWidth()/2,pane.getHeight()/2, 100,50);
            ellipse.setFill(Color.WHITE);
//            ellipse.setFill(null);
            ellipse.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
//            ellipse.setStroke(Color.BLACK);
            ellipse.setRotate(j);
            pane.getChildren().add(ellipse);
        }


        stage.setTitle("ShowEllipse");
        stage.setScene(scene);
        stage.show();

    }
}
