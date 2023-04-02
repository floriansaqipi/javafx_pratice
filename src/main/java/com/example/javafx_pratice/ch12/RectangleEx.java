package com.example.javafx_pratice.ch12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RectangleEx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();

        Rectangle rectangle  = new Rectangle(25,10,60,30);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        pane.getChildren().add(new Text(10,20, "r1"));
        pane.getChildren().add(rectangle);

        Rectangle rectangle1 = new Rectangle(25,50,60,30);
        pane.getChildren().add(new Text(10,67,"r2"));
        pane.getChildren().add(rectangle1);

        Rectangle rectangle2 = new Rectangle(25,90,60,30);
        rectangle2.setArcWidth(15);
        rectangle2.setArcHeight(25);
        pane.getChildren().add(new Text(10,107,"r3"));
        pane.getChildren().add(rectangle2);

        for(int i = 0,j = 0; i< 4;i++,j += 45){
            Rectangle r = new Rectangle(100,50,100,30);
            r.setRotate(j);
            r.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
//            r.setFill(Color.WHITE);
            r.setFill(null);
            pane.getChildren().add(r);
        }


        Scene scene = new Scene(pane,250,150);
        stage.setTitle("ShowRectangle");
        stage.setScene(scene);
        stage.show();
    }
}
