package com.example.javafx_pratice.ch06;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class BindingBidirectional {
    public static void main(String[] args){
        IntegerProperty i1 = new SimpleIntegerProperty(5);
        IntegerProperty i2 = new SimpleIntegerProperty(10);
        i1.bindBidirectional(i2);
        System.out.printf("i1: %d\ni2: %d\n",i1.getValue(),i2.getValue());
        i1.setValue(i1.getValue() + 1);
        System.out.printf("i1: %d\ni2: %d\n",i1.getValue(),i2.getValue());

    }
}
