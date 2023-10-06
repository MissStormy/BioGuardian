package com.bioguardian.bioguardian;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AppCtrl {
    @FXML
    private Button ExitBtn;

    @FXML
    void OnClickClose(ActionEvent event) {
        Stage stage = (Stage) this.ExitBtn.getScene().getWindow();
        stage.close();
    }
}