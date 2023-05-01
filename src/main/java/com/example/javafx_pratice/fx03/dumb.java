package com.example.javafx_pratice.fx03;

import com.example.javafx_pratice.SMTH;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class dumb extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(dumb.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Hello!");
        primaryStage.getIcons().add(new Image(dumb.class.getResource("a.jpg").toExternalForm()));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
