package com.example.javafx_pratice.ch10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImagesDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));

        Image image = new Image("images/1.jpg");

        pane.getChildren().add(new ImageView(image));

        ImageView imageView = new ImageView("images/1.jpg");
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        pane.getChildren().add(imageView);

        ImageView imageView1 = new ImageView(image);
        imageView1.setRotate(90);
        pane.getChildren().add(imageView1);

        Scene scene = new Scene(pane);

        primaryStage.setTitle("Image Example");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
