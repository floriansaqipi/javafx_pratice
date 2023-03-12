package com.example.javafx_pratice.ch10;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageEx extends Application {
    @Override
    public void start(Stage primaryStage){
        Image image = new Image("file:1.jpg");
        ImageView imageView = new ImageView(image);
        ImageView imageView1 = new ImageView("file:1.jpg");
    }
}
