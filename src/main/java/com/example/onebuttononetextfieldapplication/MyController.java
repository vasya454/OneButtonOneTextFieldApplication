package com.example.onebuttononetextfieldapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MyController {
    @FXML
    TextField textField1;

    @FXML
    VBox vBox1;

    @FXML
    protected void onButton1Click() {
        vBox1.getChildren().clear();
        try {
            int n = Integer.parseInt(textField1.getText());
            if (n > 0 && n < 8) {
                for (int i = 0; i < n; i++) {
                    Button buttn = new Button((i + 1) + "");
                    vBox1.getChildren().add(buttn);
                    buttn.setOnAction(a -> {
                        System.out.println(buttn.getText());
                        vBox1.getChildren().remove(buttn);}
                    );
                }
            } else {
                textField1.clear();
                textField1.setPromptText("Введите число от 1 до 7");
            }
        } catch (Exception e) {
        }
    }
}