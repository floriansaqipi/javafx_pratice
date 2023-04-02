package com.example.javafx_pratice.ch12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RadiationShape extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new RadiationPane(3),400,400);
        stage.setTitle("Radiation Sign");
        stage.setScene(scene);
        stage.show();
    }
}

class RadiationPane extends Pane{
    private int n;
    public RadiationPane(){

    }
    public RadiationPane(int n){
        this.n = n;
        this.drawOuterCircle();
        this.drawArcs();
        this.drawInnerCircle();
    }

    private void drawOuterCircle(){
        Circle circle = new Circle(200,200,150);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.YELLOW);
        circle.setStrokeWidth(5);
        this.getChildren().add(circle);
    }

    private void drawArcs(){
        for(int i = 0; i< this.n ;i++){

            Arc arc = new Arc(200,200,140,140,i * (360/this.n),360/(this.n*2));
            arc.setFill(Color.BLACK);
            arc.setType(ArcType.ROUND);

            this.getChildren().add(arc);
        }
    }

    private void drawInnerCircle(){
        Circle circle = new Circle(200,200,35);
        circle.setStroke(Color.YELLOW);
        circle.setStrokeWidth(15);
        this.getChildren().add(circle);
    }
}
