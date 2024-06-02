package com.oop.mahadi.demo3choisbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class ChoisBoxContr {
    @javafx.fxml.FXML
public void initialize() {
        String[] s={"a","b","c"};
        ChoisBoxFxid.getItems().addAll(s);
        ChoisBoxFxid.setOnAction(this::pp);




}

    @FXML
    private ChoiceBox<String> ChoisBoxFxid;

    @FXML
    private Label LAvelFxid;
    public void pp(ActionEvent event){
        LAvelFxid.setText(ChoisBoxFxid.getValue());

    }


}