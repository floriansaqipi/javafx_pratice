package com.example.javafx_pratice.fx17;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Example extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Student Grades Management");

        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("student_grades.fxml"));
        BorderPane root = loader.load();

        // Set the FXML file as the root of the scene
        Scene scene = new Scene(root, 800, 600);

        // Set the scene
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
