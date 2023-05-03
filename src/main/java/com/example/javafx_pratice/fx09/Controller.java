package com.example.javafx_pratice.fx09;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImageView;

    private Image myImageOff = new Image(Controller.class.getResourceAsStream("lightbulb_off.jpg"));
    private Image myImageOn = new Image(Controller.class.getResourceAsStream("lightbulb_on.png"));

    public void change(){
        if(myCheckBox.isSelected()){
            System.out.println("ON");
            myLabel.setText("ON");
            myImageView.setImage(myImageOn);
        }else {
            System.out.println("OFF");
            myLabel.setText("OFF");
            myImageView.setImage(myImageOff);
        }

    }
}
