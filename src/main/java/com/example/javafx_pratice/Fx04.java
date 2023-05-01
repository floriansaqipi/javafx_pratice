package com.example.javafx_pratice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Fx04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Fx04.class.getResource("SomeCss.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        String css = Fx04.class.getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);
//        scene1.getStylesheets().add(css);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
