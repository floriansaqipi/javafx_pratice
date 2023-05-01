package com.example.javafx_pratice.fx07;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {
    @FXML
    private ImageView myImageView;

    @FXML
    private Button myButton;

    private Image myImage = new Image(ImageController.class.getResourceAsStream("image2.jpg"));

    public void displayImage(){
        myImageView.setImage(myImage);
    }
}
