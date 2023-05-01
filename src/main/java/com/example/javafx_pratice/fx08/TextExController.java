package com.example.javafx_pratice.fx08;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextExController {
    @FXML
    private Label myLabel;

    @FXML
    private TextField myTextField;

    @FXML
    private Button myButton;

    private int age;

    public void submit(){
        try {
            age = Integer.parseInt(myTextField.getText());
//            System.out.println(age);
            if(age >= 18){
                myLabel.setText("You successfully signed up!");
            } else {
                myLabel.setText("You must be at least 18 to sign up!");
            }
        } catch (NumberFormatException e){
//            System.out.println("Enter only numbers please");
            myLabel.setText("Enter only numbers please");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
