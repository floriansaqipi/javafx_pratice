package com.example.javafx_pratice.ch11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HboxHboxEx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        Scene scene = new Scene(pane);
        stage.setTitle("ShowHBoxVbox");
        stage.setScene(scene);
        stage.show();
    }

    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("-fx-background-color: gold;");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
//        ImageView imageView = new ImageView("images/1.jpg");
//        hBox.getChildren().add(imageView);
        return hBox;
    }
    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15,5,5,5));
        vBox.getChildren().add(new Label("Courses"));

        Label[] courses =
                {new Label("CSCI 1301"), new Label("CSCI 1302"),
                new Label("CSCI 2410"), new Label("CSCI 3720")};

        for(Label label: courses){
            VBox.setMargin(label, new Insets(0,0,0,15));
            vBox.getChildren().add(label);
        }
        return vBox;
    }

}
