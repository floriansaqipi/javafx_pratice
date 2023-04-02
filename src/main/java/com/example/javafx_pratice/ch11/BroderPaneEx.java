package com.example.javafx_pratice.ch11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BroderPaneEx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        pane.setTop(new CustomPane("Top"));
        pane.setRight(new CustomPane("Right"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setCenter(new CustomPane("Center"));

        Scene scene = new Scene(pane);
        stage.setTitle("ShowBorderPane");
        stage.setScene(scene);
        stage.show();
    }
}

class CustomPane extends StackPane{
    public CustomPane(String title){
        this.getChildren().add(new Label(title));
        this.setStyle("-fx-border-color: red");
        this.setPadding(new Insets(11.5,12.5,13.5,14.5));
    }
}
