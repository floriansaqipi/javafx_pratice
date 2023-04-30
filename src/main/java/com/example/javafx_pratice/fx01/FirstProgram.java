package com.example.javafx_pratice.fx01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FirstProgram extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Group group = new Group();
        Scene scene = new Scene(group,300,400, Color.BLACK);

//        Image icon = new Image("src/main/resources/com/example/javafx_pratice/istockphoto-1152086798-612x612.jpg");
//        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("WOOT WOOT");
        primaryStage.setWidth(420);
        primaryStage.setHeight(420);

        primaryStage.setResizable(false);

        primaryStage.setX(50);
        primaryStage.setY(50);

        primaryStage.setFullScreen(true);

        primaryStage.setFullScreenExitHint("You can't escape unless you press q");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("q"));
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
