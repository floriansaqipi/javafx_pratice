package com.example.javafx_pratice.ch11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneEx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);
        pane.setVgap(5);

        pane.getChildren().addAll(new Label("First Name: "), new TextField(), new Label("MI: "));
        TextField tfmi = new TextField();
        tfmi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfmi, new Label("LastName: "), new TextField());
//        pane.getChildren().remove(node);
//          pane.getChildren().removeAll();
        Scene scene = new Scene(pane, 200, 250);
        stage.setTitle("ShowFlowPane");
        stage.setScene(scene);
        stage.show();
    }
}
