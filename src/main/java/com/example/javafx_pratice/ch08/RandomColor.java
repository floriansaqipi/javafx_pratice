package com.example.javafx_pratice.ch08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RandomColor extends Application {
    @Override
    public void start(Stage primaryStage){
        int max = 255;
        int min = 0;
        int range = max-min + 1;
        int rand = (int)(Math.random()*range) + min;
        int rand1 = (int)(Math.random()*range) + min;
        int rand2 = (int)(Math.random()*range) + min;

        Color color = new Color(Math.random(),Math.random(),Math.random(),Math.random());
        Color color1 = Color.rgb(rand,rand1,rand2,Math.random());
        Circle circle = new Circle();
        circle.setStroke(null);
        circle.setFill(color);
        circle.setRadius(200);

        Circle circle1 = new Circle();
        circle1.setStroke(null);
        circle1.setFill(color1);
        circle1.setRadius(100);

        Circle circle2 = new Circle();
        circle2.setStroke(null);
        circle2.setFill(Color.PURPLE);
        circle2.setStyle("-jx-fill-color: purple;");
        circle2.setRadius(50);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(circle,circle1,circle2);

        Scene scene = new Scene(stackPane,500,500);

        primaryStage.setTitle("Random Colors");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}
