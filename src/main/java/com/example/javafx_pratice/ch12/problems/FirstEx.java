package com.example.javafx_pratice.ch12.problems;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstEx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPadding(new Insets(20));

        Text text = new Text(10,10,"This is a cool text i like");
        Line line = new Line(10,30,30,30);
        Rectangle rectangle = new Rectangle(50,50,20,40);
        Circle circle = new Circle(50, 150, 50);
        Ellipse ellipse = new Ellipse(50,250,40,50);
        Arc arc = new Arc(50,350,50,50,0,90);
        Polygon polygon = new Polygon(75,400,50,450,100,450);
        Polyline polyline = new Polyline(50,500,100,500,100,550);


        pane.getChildren().addAll(text,line,rectangle,circle, ellipse, arc,polygon,polyline);

        Scene scene = new Scene(pane);
        stage.setTitle("First Example");
        stage.setScene(scene);
        stage.show();
    }
}
