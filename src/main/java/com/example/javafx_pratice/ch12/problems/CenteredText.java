package com.example.javafx_pratice.ch12.problems;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CenteredText extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300,300);


        Text text = new Text("smth");
        text.xProperty().bind(pane.widthProperty().divide(2));
        text.yProperty().bind(pane.heightProperty().divide(2));
        text.setRotate(45);

        pane.getChildren().add(text);
        System.out.println(pane.getWidth());

        stage.setTitle("Centered String");
        stage.setScene(scene);
        stage.show();
    }
}
