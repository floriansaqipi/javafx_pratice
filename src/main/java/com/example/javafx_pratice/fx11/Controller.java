package com.example.javafx_pratice.fx11;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private Label myLabel;

    public void getDate(){
        LocalDate myDate = myDatePicker.getValue();
//        System.out.println(myDate.toString());
//        String formatedDate = myDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        String formatedDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
        myLabel.setText(formatedDate);
    }
}
