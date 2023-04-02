package com.example.javafx_pratice.ch11;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneEx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("First name: "),0,0);
        pane.add(new TextField(),1,0);
        pane.add(new Label("MI: "),0,1);
        pane.add(new TextField(),1,1);
        pane.add(new Label("Last name: "),0,2);
        pane.add(new TextField(),1,2);

//        pane.getChildren().remove(node);
//        pane.getChildren().removeAll();

        Button btn = new Button("Add name");
        pane.add(btn, 1,3);
        GridPane.setHalignment(btn, HPos.RIGHT);

        Scene scene = new Scene(pane);
        stage.setTitle("ShowGridPane");
        stage.setScene(scene);
        stage.show();




    }
}
