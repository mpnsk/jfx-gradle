package com.example;

import javafx.scene.control.Label;

public class Controller {
    public Label label;

    public void initialize(){
        String s = "Hello World!";
        System.out.println(s);
        label.setText(s);
    }
}
