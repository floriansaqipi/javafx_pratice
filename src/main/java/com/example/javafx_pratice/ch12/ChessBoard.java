package com.example.javafx_pratice.ch12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessBoard extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new ChessPane());
        stage.setTitle("Chess Board");
        stage.setScene(scene);
        stage.show();
    }
}

class ChessPane extends Pane{
    public ChessPane(){
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){

                Rectangle rectangle = new Rectangle(j* 100,i* 100,100,100);
                rectangle.setFill(chooseColor(i+j));
                this.getChildren().add(rectangle);
            }
        }
    }

    private Color chooseColor(int n){
        return n % 2 == 0 ? Color.WHITE : Color.BLACK;
    }
}
