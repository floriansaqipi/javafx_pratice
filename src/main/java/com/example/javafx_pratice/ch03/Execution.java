package com.example.javafx_pratice.ch03;

import javafx.application.Application;
import javafx.stage.Stage;

public class Execution extends Application {
    public Execution(){
        System.out.printf("Execution constructor\n");
    }
    @Override
    public void start(Stage primaryStage){
        System.out.printf("start method here\n");

    }
    public static void main(String[] args){
        System.out.printf("Main method launch called\n");
        Application.launch(args);
    }
}

